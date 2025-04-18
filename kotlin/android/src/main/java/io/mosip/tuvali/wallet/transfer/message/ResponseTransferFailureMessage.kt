package foundation.openwallet.tuvali.wallet.transfer.message

class ResponseTransferFailureMessage(val errorMsg: String): IMessage(TransferMessageTypes.RESPONSE_TRANSFER_FAILED) {}
