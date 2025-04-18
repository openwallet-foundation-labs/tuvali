package foundation.openwallet.tuvali.wallet.transfer.message

class InitRetryTransferMessage(val missedSequences: IntArray): IMessage(TransferMessageTypes.INIT_RETRY_TRANSFER)
