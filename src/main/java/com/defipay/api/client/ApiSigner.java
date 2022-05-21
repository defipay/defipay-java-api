package com.defipay.api.client;

/***
 *
 */
public interface ApiSigner {
    String sign(byte[] message);

    String getPublicKey();
}
