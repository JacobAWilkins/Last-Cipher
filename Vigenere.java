public class Vigenere {
	public static String Vigenere_encrypt(String text, String key) {
		
		text = text.toUpperCase();
		key = key.toUpperCase();
		String result = "";
		int counter = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			char character = text.charAt(i);
			if (character < 'A' || character > 'Z') { continue; }
			result += (char)((character + key.charAt(counter) - 2 * 'A') % 26 + 'A');
			counter = ++counter % key.length();
			
		}
		
		return result;
		
	}
	
	public static String Vigenere_decrypt(String text, String key) {
		
		text = text.toUpperCase();
		key = key.toUpperCase();
		String result = "";
		int counter = 0;
		
		for (int i = 0; i < text.length(); i++) {
			
			char character = text.charAt(i);
			if (character < 'A' || character > 'Z') { continue; }
			result += (char)((character - key.charAt(counter) +26) % 26 + 'A');
			counter = ++counter % key.length();
			
		}
		
		return result;
	}
	
}
