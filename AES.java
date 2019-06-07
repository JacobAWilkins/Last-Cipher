import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.util.Base64;

public class AES {
	
	public static String AES_encrypt(String text, String key) {
		
		try {
			SecretKeySpec sks = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, sks);
			
			byte[] enc = cipher.doFinal(text.getBytes());
			return Base64.getEncoder().encodeToString(enc);
		} catch (Exception e) {
			System.out.println("Error encrypting AES.\nExiting...");
			e.printStackTrace();
			System.exit(0);
		}
		return null;
		
	}
	
	public static String AES_decrypt(String text, String key) {
		
		try {
			
			SecretKeySpec sks = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, sks);
			
			byte[] dec = cipher.doFinal(Base64.getDecoder().decode(text));
			return new String(dec);
			
		} catch (Exception e) {
			System.out.println("Error decrypting AES.\nExiting...");
			e.printStackTrace();
			System.exit(0);
		}
		return null;
		
	}
	
}
