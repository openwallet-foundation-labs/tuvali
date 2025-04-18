package foundation.openwallet.tuvali.wallet.transfer.message

class ResponseChunkWriteFailureMessage(val err: Int) : IMessage(TransferMessageTypes.RESPONSE_CHUNK_WRITE_FAILURE) {}
