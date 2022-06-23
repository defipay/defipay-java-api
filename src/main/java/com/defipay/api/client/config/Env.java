package com.defipay.api.client.config;

public class Env {
    //todo
    public static Env SANDBOX = new Env("https://api-test.defipay.biz/", "02a17fffb024cce6220ddf91b40711dc15fd8f830e23f6160c6a4eac8bc0eba820");
    public static Env PROD = new Env("https://api.defipay.biz/", "02adb46f0c10b5ec51d0df2183a812fdf7b330ef2c948e36cdb479f1af73a22753");

    public String host;
    public String defipayPub;

    public Env(String host, String defipayPub) {
        this.host = host;
        this.defipayPub = defipayPub;
    }

}
