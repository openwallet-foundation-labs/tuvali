package foundation.openwallet.tuvali.wallet.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class WalletTransferHandlerException(message: String, cause: Exception): BLEException(message, cause, ErrorCode.WalletTransferHandlerException)
