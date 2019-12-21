package com.mulberry.base64;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class base64 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "这就是一个文件";
        //加密
        String b64 = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
        System.out.println(b64);
        //解密
        String rb64 = new String(Base64.getDecoder().decode(b64), StandardCharsets.UTF_8);
        System.out.println(rb64);
    }
}
