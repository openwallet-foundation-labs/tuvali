package foundation.openwallet.tuvali.common.safeExecute

import foundation.openwallet.tuvali.exception.handlers.ExceptionHandler

class TryExecuteSync(private val bleExceptionHandler: ExceptionHandler) {
  private val mutex = Object()

  fun <T> run(fn: () -> T): T? {
    var returnValue: T? = null

    synchronized(mutex) {
      try {
        returnValue = fn()
      } catch (e: Exception) {
        bleExceptionHandler.handleException(e)
      }
    }

    return returnValue
  }
}
