package com.tedu.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5数据加密
 */
public class CodeUtil {
    public static String getMD5Encoding(String password) {
        //创建MD5加密计算器
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //格式化数据
        md5.update(password.getBytes());
        return new BigInteger(1, md5.digest()).toString(16);
    }
}
