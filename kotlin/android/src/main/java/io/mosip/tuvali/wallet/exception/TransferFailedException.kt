package foundation.openwallet.tuvali.wallet.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class TransferFailedException(s: String) : BLEException(s, null, ErrorCode.TransferFailedException)
