package foundation.openwallet.tuvali.verifier.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class CorruptedChunkReceivedException(size: Int, receivedSeqNumber: Int, receivedMtuSize: Int) : BLEException(
  "size: $size, receivedSeqNumber: $receivedSeqNumber, receivedMtuSize: $receivedMtuSize",
  null,
  ErrorCode.CorruptedChunkReceivedException
)
