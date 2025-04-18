package foundation.openwallet.tuvali.verifier.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class TooManyFailureChunksException(s: String, crcFailureCount: Int, totalChunkCount: Int) :
  BLEException(s, null, ErrorCode.TooManyFailureChunksException, crcFailureCount, totalChunkCount)
