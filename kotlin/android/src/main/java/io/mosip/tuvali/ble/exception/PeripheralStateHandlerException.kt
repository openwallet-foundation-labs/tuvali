package foundation.openwallet.tuvali.ble.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class PeripheralStateHandlerException(message: String, cause: Exception): BLEException(message, cause,
  ErrorCode.PeripheralStateHandlerException
)
