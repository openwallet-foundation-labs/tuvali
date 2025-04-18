package foundation.openwallet.tuvali.verifier.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

open class VerifierException(
  message: String,
  cause: Exception? = null,
  crcFailureCount: Int? = null,
  totalChunkCount: Int? = null
) :
  BLEException(
    message,
    cause,
    errorCode = ErrorCode.VerifierUnknownException,
    crcFailureCount = crcFailureCount,
    totalChunkCount = totalChunkCount
  )
