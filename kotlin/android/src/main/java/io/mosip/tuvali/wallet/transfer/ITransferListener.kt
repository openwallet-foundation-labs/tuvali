package foundation.openwallet.tuvali.wallet.transfer

import foundation.openwallet.tuvali.exception.BLEException

interface ITransferListener {
  fun onResponseSent()
  fun onResponseSendFailure(errorMsg: String)
  fun onException(exception: BLEException)
}
