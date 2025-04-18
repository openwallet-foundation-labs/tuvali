package foundation.openwallet.tuvali.ble.exception

import foundation.openwallet.tuvali.exception.BLEException
import foundation.openwallet.tuvali.exception.ErrorCode

class CentralStateHandlerException(message: String, cause: Exception): BLEException(message, cause,
  ErrorCode.CentralStateHandlerException
)
