package foundation.openwallet.tuvali.wallet.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class MTUNegotiationFailedException(s: String) : BLEException(s, null, ErrorCode.MTUNegotiationException)
