package foundation.openwallet.tuvali.cryptography;

public interface WalletCryptoBox {
    byte[] publicKey();
    SecretsTranslator buildSecretsTranslator(byte[] walletPublicKey);
}
