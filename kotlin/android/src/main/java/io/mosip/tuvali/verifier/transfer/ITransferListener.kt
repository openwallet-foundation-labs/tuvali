package foundation.openwallet.tuvali.verifier.transfer

import foundation.openwallet.tuvali.exception.BLEException
import java.util.UUID

interface ITransferListener {
  fun sendDataOverNotification(charUUID: UUID, data: ByteArray)
  fun onResponseReceived(data: ByteArray, crcFailureCount: Int, totalChunkCount: Int)
  fun onResponseReceivedFailed(errorMsg: String)
  fun onException(exception: BLEException)
}
