package foundation.openwallet.tuvali.verifier.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class UnsupportedMTUSizeException(s: String) : BLEException(s, null, ErrorCode.UnsupportedMTUSizeException) {}
