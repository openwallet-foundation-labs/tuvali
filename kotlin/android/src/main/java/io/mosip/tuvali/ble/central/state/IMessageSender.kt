package foundation.openwallet.tuvali.ble.central.state

import foundation.openwallet.tuvali.ble.central.state.message.IMessage

interface IMessageSender {
  fun sendMessage(msg: IMessage)
  fun getCurrentState() : StateHandler.States
  fun sendMessageDelayed(msg: IMessage, delay: Long)
}
