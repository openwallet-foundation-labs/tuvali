package foundation.openwallet.tuvali.verifier.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class VerifierTransferHandlerException(
  message: String,
  cause: Exception,
  crcFailureCount: Int? = null,
  totalChunkCount: Int? = null,
) :
  BLEException(
    message,
    cause,
    ErrorCode.VerifierTransferHandlerException,
    crcFailureCount,
    totalChunkCount
  )
