package foundation.openwallet.tuvali.common.events

import foundation.openwallet.tuvali.exception.ErrorCode

class EventEmitter {
  private var listeners = mutableListOf<((Event) -> Unit)>()

  fun addListener(listener: (Event) -> Unit) {
    listeners.add(listener)
  }

  fun emitErrorEvent(message: String, code: ErrorCode) {
    emitEvent(ErrorEvent(message, code.value))
  }

  fun emitEvent(event: Event) {
    listeners.forEach{it(event)}
  }

  fun removeListeners() {
    listeners.clear()
  }
}
