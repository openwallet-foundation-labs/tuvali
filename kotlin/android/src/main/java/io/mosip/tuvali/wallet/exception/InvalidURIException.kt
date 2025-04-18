package foundation.openwallet.tuvali.wallet.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class InvalidURIException(message: String): BLEException(message, null, ErrorCode.InvalidURIException)
