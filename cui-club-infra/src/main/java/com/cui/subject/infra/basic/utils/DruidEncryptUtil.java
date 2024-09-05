package com.cui.subject.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * 数据库加密工具类
 *
 * 该类用于生成密钥对，并提供加密和解密功能。
 *
 * @author: cui
 * @date: 2024/8/31
 */
public class DruidEncryptUtil {

    // 存储公钥
    private static String publicKey;

    // 存储私钥
    private static String privateKey;

    // 静态代码块，用于生成密钥对
    static {
        try {
            // 生成512位的密钥对
            String[] keyPair = ConfigTools.genKeyPair(512);
            privateKey = keyPair[0]; // 获取私钥
            System.out.println("privateKey:" + privateKey); // 输出私钥
            publicKey = keyPair[1]; // 获取公钥
            System.out.println("publicKey:" + publicKey); // 输出公钥
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); // 打印异常信息
        } catch (NoSuchProviderException e) {
            e.printStackTrace(); // 打印异常信息
        }
    }

    /**
     * 加密方法
     *
     * @param plainText 要加密的明文
     * @return 加密后的密文
     * @throws Exception 加密过程中可能抛出的异常
     */
    public static String encrypt(String plainText) throws Exception {
        // 使用私钥加密明文
        String encrypt = ConfigTools.encrypt(privateKey, plainText);
        System.out.println("encrypt:" + encrypt); // 输出加密后的密文
        return encrypt; // 返回密文
    }

    /**
     * 解密方法
     *
     * @param encryptText 要解密的密文
     * @return 解密后的明文
     * @throws Exception 解密过程中可能抛出的异常
     */
    public static String decrypt(String encryptText) throws Exception {
        // 使用公钥解密密文
        String decrypt = ConfigTools.decrypt(publicKey, encryptText);
        System.out.println("decrypt:" + decrypt); // 输出解密后的明文
        return decrypt; // 返回明文
    }

    /**
     * 主方法，用于测试加密功能
     *
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        // 测试加密功能
        String encrypt = encrypt("123456");
        System.out.println("encrypt:" + encrypt); // 输出加密后的结果
    }
}
