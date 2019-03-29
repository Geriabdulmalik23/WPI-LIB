package id.winpay.api.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Reza Ishaq Maulana <es.mgr@bm.co.id>
 */
public class OpenSslAes {

    public static String openssl_decrypt(String input, String key) throws NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException {

        key = hash(key).substring(0, 32);
        byte[] bytes = Base64.getDecoder().decode(input);
        if (bytes.length < 17) {
            return null;
        }

        byte[] ivBytes = key.getBytes();
        byte[] contentBytes = bytes;

        Cipher ciper = Cipher.getInstance("AES/CBC/PKCS5Padding");

        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
        IvParameterSpec iv = new IvParameterSpec(ivBytes, 0, ciper.getBlockSize());

        ciper.init(Cipher.DECRYPT_MODE, keySpec, iv);
        return new String(ciper.doFinal(Base64.getDecoder().decode(contentBytes)));

    }

    public static String openssl_encrypt(String data, String strKey) throws Exception {
        String ivs = hash(strKey).substring(0, 16);
        String keyhash = hash(strKey).substring(0, 32);
        Cipher ciper = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec key = new SecretKeySpec(keyhash.getBytes(), "AES");
        IvParameterSpec iv = new IvParameterSpec(ivs.getBytes(), 0, ciper.getBlockSize());

        // Encrypt
        ciper.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] encryptedCiperBytes = Base64.getEncoder().encode(ciper.doFinal(data.getBytes()));

        String s = new String(encryptedCiperBytes);
        String ss = Base64.getEncoder().encodeToString(encryptedCiperBytes);
        return ss;
    }

    private static String hash(String iv) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(
                iv.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
