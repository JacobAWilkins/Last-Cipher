import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.util.Base64;

public class Blowfish {
	
	public static String Blowfish_encrypt(String text, String secret) throws Exception {
		
		String encDataString = "";
		
		if (secret == null || secret.length() > 32) {
			System.out.println("Blowfish has invalid key.\nExiting...");
			System.exit(0);
		}
		
		try {
			
			byte[] secBytes = HexToBin(secret);
			SecretKey sk = new SecretKeySpec(secBytes, "Blowfish");
			
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.ENCRYPT_MODE, sk);
			
			byte[] encDataBytes = cipher.doFinal(text.getBytes("UTF8"));
			encDataString = Base64.getEncoder().encodeToString(encDataBytes);
			
		} catch(Exception e) {
			System.out.println("ERROR: Blowfish encryption\nExiting...");
			System.exit(0);
		}
		return encDataString;
	}
	
	public static String Blowfish_decrypt(String text, String secret) throws Exception {
		
		byte[] decDataBytes = new byte[0];
		
		if (secret == null || secret.length() > 32) {
			System.out.println("Blowfish has invalid key.\nExiting...");
			System.exit(0);
		}
		
		try {
			
			byte[] secBytes = HexToBin(secret);
			SecretKey sk = new SecretKeySpec(secBytes, "Blowfish");
			
			Cipher decipher = Cipher.getInstance("Blowfish");
			decipher.init(Cipher.DECRYPT_MODE, sk);
			
			decDataBytes = decipher.doFinal(HexToBin(text));
			return new String(decDataBytes, "UTF8");
			
		} catch(Exception e) {
			System.out.println("ERROR: Blowfish encryption\nExiting...");
			System.exit(0);
		}
		return new String(decDataBytes, "UTF8");
	}
	
	public static byte[] HexToBin(String s) {
		
		s = s.toUpperCase();
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			char character = s.charAt(i);
			if (character == '0') { result = result + "0000"; }
			else if (character == '1') { result = result + "0001"; }
			else if (character == '2') { result = result + "0010"; }
			else if (character == '3') { result = result + "0011"; }
			else if (character == '4') { result = result + "0100"; }
			else if (character == '5') { result = result + "0101"; }
			else if (character == '6') { result = result + "0110"; }
			else if (character == '7') { result = result + "0111"; }
			else if (character == '8') { result = result + "1000"; }
			else if (character == '9') { result = result + "1001"; }
			else if (character == 'A') { result = result + "1010"; }
			else if (character == 'B') { result = result + "1011"; }
			else if (character == 'C') { result = result + "1100"; }
			else if (character == 'D') { result = result + "1101"; }
			else if (character == 'E') { result = result + "1110"; }
			else if (character == 'F') { result = result + "1111"; }
		}
		return result.getBytes();
		
	}
	
}
