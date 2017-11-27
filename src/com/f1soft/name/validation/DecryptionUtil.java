package com.f1soft.name.validation;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author biswas.sigdel
 */
public class DecryptionUtil {

    private static String sharedKeyForEncryption = "123000000000000000000xyz";
    private static byte[] sharedkey = {
        0x01, 0x02, 0x03, 0x05, 0x07, 0x0B, 0x0D, 0x11,
        0x12, 0x11, 0x0D, 0x0B, 0x07, 0x02, 0x04, 0x08,
        0x01, 0x02, 0x03, 0x05, 0x07, 0x0B, 0x0D, 0x11
    };
    private static byte[] sharedvector = {
        10, 10, 10, 20, 20, 20, 55, 8
    };

    public static String decrypt(String ciphertext) {
        try {
            Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            c.init(Cipher.DECRYPT_MODE, new SecretKeySpec(sharedKeyForEncryption.getBytes(), "DESede"));
            byte[] decrypted = c.doFinal(Base64.decode(ciphertext));
            return new String(decrypted, "UTF-8");
        } catch (Exception ex) {
            return ciphertext;
        }
    }

}
