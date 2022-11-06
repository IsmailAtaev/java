package encryption;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class EncryptionSHA_1 {
    public static void main(String[] args) {
        String encryped  = "Pass_1";
        MessageDigest messageDigest = null;
        byte[] byteSencoded  = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(encryped.getBytes(StandardCharsets.UTF_8));
            byteSencoded = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        BigInteger bigInteger = new BigInteger(1,byteSencoded);
        String resHex =  bigInteger.toString(16);
        System.out.println(resHex);
        Locale.setDefault(Locale.CANADA);
    }
}