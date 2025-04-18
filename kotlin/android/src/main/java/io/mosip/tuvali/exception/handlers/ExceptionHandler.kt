package foundation.openwallet.tuvali.exception.handlers

import android.util.Log
import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode
import foundation.openwallet.tuvali.exception.ExceptionUtils
import foundation.openwallet.tuvali.exception.UnknownException

import foundation.openwallet.tuvali.transfer.Util
import foundation.openwallet.tuvali.verifier.exception.VerifierException
import foundation.openwallet.tuvali.wallet.exception.WalletException

class ExceptionHandler(private val sendError: (String, ErrorCode) -> Unit, private val stopBle: (() -> Unit) -> Unit) {
  private val logTag = Util.getLogTag(javaClass.simpleName)
  private var walletExceptionHandler: WalletExceptionHandler = WalletExceptionHandler(sendError)
  private var verifierExceptionHandler: VerifierExceptionHandler = VerifierExceptionHandler(sendError)

  private fun handleWalletException(e: WalletException) {
    walletExceptionHandler.handleException(e)
  }

  private fun handleVerifierException(e: VerifierException) {
    verifierExceptionHandler.handleException(e)
  }

  fun handleException(e: Exception) {
    when (e) {
      is WalletException -> {
        handleWalletException(e)
      }
      is VerifierException -> {
        handleVerifierException(e)
      }
      else -> {
        handleUnknownException(UnknownException("Unknown Exception in Tuvali", e))
      }
    }

    try {
      stopBle {}
    } catch (e: Exception) {
      Log.d(logTag, "Failed to stop BLE connection while handling exception: $e")
    }
  }

  private fun handleUnknownException(e: BLEException) {
    val rootCause = ExceptionUtils.getRootBLECause(e)

    Log.e(logTag, "Handling Unknown Exception: ", e)
    sendError(e.message ?: "Something went wrong in BLE: $rootCause", rootCause.errorCode)
  }
}
