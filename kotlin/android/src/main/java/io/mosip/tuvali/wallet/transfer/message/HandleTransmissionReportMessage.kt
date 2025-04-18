package foundation.openwallet.tuvali.wallet.transfer.message

import foundation.openwallet.tuvali.transfer.TransferReport

class HandleTransmissionReportMessage(val report: TransferReport): IMessage(TransferMessageTypes.HANDLE_TRANSMISSION_REPORT) {}
