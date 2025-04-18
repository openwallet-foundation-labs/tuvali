package foundation.openwallet.tuvali.verifier

import foundation.openwallet.tuvali.common.events.Event

interface IVerifier {
  fun startAdvertisement(advIdentifier: String): String
  fun disconnect()
  fun sendVerificationStatus(status: Int)
  fun subscribe(listener: (Event) -> Unit)
  fun unSubscribe()
}
