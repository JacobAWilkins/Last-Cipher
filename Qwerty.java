public class Qwerty {
	
	public static String Qwerty_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "q"; }
			else if (character == 'b') { result = result + "w"; }
			else if (character == 'c') { result = result + "e"; }
			else if (character == 'd') { result = result + "r"; }
			else if (character == 'e') { result = result + "t"; }
			else if (character == 'f') { result = result + "y"; }
			else if (character == 'g') { result = result + "u"; }
			else if (character == 'h') { result = result + "i"; }
			else if (character == 'i') { result = result + "o"; }
			else if (character == 'j') { result = result + "p"; }
			else if (character == 'k') { result = result + "a"; }
			else if (character == 'l') { result = result + "s"; }
			else if (character == 'm') { result = result + "d"; }
			else if (character == 'n') { result = result + "f"; }
			else if (character == 'o') { result = result + "g"; }
			else if (character == 'p') { result = result + "h"; }
			else if (character == 'q') { result = result + "j"; }
			else if (character == 'r') { result = result + "k"; }
			else if (character == 's') { result = result + "l"; }
			else if (character == 't') { result = result + "z"; }
			else if (character == 'u') { result = result + "x"; }
			else if (character == 'v') { result = result + "c"; }
			else if (character == 'w') { result = result + "v"; }
			else if (character == 'x') { result = result + "b"; }
			else if (character == 'y') { result = result + "n"; }
			else if (character == 'z') { result = result + "m"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
	public static String Qwerty_decrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'q') { result = result + "a"; }
			else if (character == 'w') { result = result + "b"; }
			else if (character == 'e') { result = result + "c"; }
			else if (character == 'r') { result = result + "d"; }
			else if (character == 't') { result = result + "e"; }
			else if (character == 'y') { result = result + "f"; }
			else if (character == 'u') { result = result + "g"; }
			else if (character == 'i') { result = result + "h"; }
			else if (character == 'o') { result = result + "i"; }
			else if (character == 'p') { result = result + "j"; }
			else if (character == 'a') { result = result + "k"; }
			else if (character == 's') { result = result + "l"; }
			else if (character == 'd') { result = result + "m"; }
			else if (character == 'f') { result = result + "n"; }
			else if (character == 'g') { result = result + "o"; }
			else if (character == 'h') { result = result + "p"; }
			else if (character == 'j') { result = result + "q"; }
			else if (character == 'k') { result = result + "r"; }
			else if (character == 'l') { result = result + "s"; }
			else if (character == 'z') { result = result + "t"; }
			else if (character == 'x') { result = result + "u"; }
			else if (character == 'c') { result = result + "v"; }
			else if (character == 'v') { result = result + "w"; }
			else if (character == 'b') { result = result + "x"; }
			else if (character == 'n') { result = result + "y"; }
			else if (character == 'm') { result = result + "z"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
}
