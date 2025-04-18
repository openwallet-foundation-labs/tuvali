package foundation.openwallet.tuvali.exception

class UnknownException(message: String, cause: Exception): BLEException(message, cause, ErrorCode.UnknownException) {
}
