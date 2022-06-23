package com.defipay.api.client.callback;

import com.blade.Blade;
import com.blade.mvc.RouteContext;
import com.blade.mvc.handler.RouteHandler;
import com.defipay.api.client.impl.LocalSigner;
import org.apache.commons.lang3.StringUtils;

public class Demo {
    private static final String defipayPubKey = "02a17fffb024cce6220ddf91b40711dc15fd8f830e23f6160c6a4eac8bc0eba820";
    static RouteHandler defipayCallback = ctx -> {
        String timestamp = ctx.header("BIZ_TIMESTAMP");
        String signature = ctx.header("BIZ_RESP_SIGNATURE");
        boolean verifyResult = false;
        try {
            if (!StringUtils.isEmpty(timestamp) && !StringUtils.isEmpty(signature)) {
                String body = ctx.bodyToString();
                String content = body + "|" + timestamp;
                verifyResult = LocalSigner.verifyEcdsaSignature(content, signature, defipayPubKey);
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        verifyResult &= customCheck(ctx);
        System.out.println("verifyResult: " + verifyResult);
        ctx.text(verifyResult ? "ok" : "deny");
    };

    public static void main(String[] args) {
        Blade.of().listen(9000)
                .get("/", ctx -> ctx.text("ok!"))
                .post("/custody_callback", defipayCallback).start();
    }

    public static boolean customCheck(RouteContext ctx) {
        //add you checking policy
        return true;
    }

}
