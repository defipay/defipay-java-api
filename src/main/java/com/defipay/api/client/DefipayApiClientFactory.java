package com.defipay.api.client;

import com.defipay.api.client.config.Env;
import com.defipay.api.client.impl.DefipayApiRestClientImpl;

public class DefipayApiClientFactory {

    private final Env env;
    private final ApiSigner signer;
    private final boolean debug;

    private DefipayApiClientFactory(ApiSigner signer, Env env, boolean debug) {
        this.signer = signer;
        this.env = env;
        this.debug = debug;
    }

    public static DefipayApiClientFactory newInstance(ApiSigner signer, Env env, boolean debug) {
        return new DefipayApiClientFactory(signer, env, debug);
    }

    public DefipayApiRestClient newRestClient() {
        return new DefipayApiRestClientImpl(signer, env, debug);
    }
}
