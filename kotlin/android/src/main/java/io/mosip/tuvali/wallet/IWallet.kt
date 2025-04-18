package foundation.openwallet.tuvali.wallet

import foundation.openwallet.tuvali.common.events.Event

interface IWallet {
  fun startConnection(uri: String)
  fun sendData(payload: String)
  fun disconnect()
  fun subscribe(listener: (Event) -> Unit)
  fun unSubscribe()
  fun handleDisconnect(status: Int, newState: Int)
}
