package foundation.openwallet.tuvali.exception.handlers

import android.util.Log
import foundation.openwallet.tuvali.exception.ErrorCode
import foundation.openwallet.tuvali.exception.ExceptionUtils
import foundation.openwallet.tuvali.transfer.Util
import foundation.openwallet.tuvali.wallet.exception.WalletException

class WalletExceptionHandler(val sendError: (String, ErrorCode) -> Unit) {
  private val logTag = Util.getLogTag(javaClass.simpleName)

  fun handleException(e: WalletException) {
    val rootCause = ExceptionUtils.getRootBLECause(e)

    Log.e(logTag, "Handling Wallet Exception: ", e)
    sendError(e.message ?: "Something went wrong in Wallet: $rootCause", rootCause.errorCode)
  }
}
