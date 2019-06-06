public class ROT10 {
	
	public static String ROT10_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "k"; }
			else if (character == 'b') { result = result + "l"; }
			else if (character == 'c') { result = result + "m"; }
			else if (character == 'd') { result = result + "n"; }
			else if (character == 'e') { result = result + "o"; }
			else if (character == 'f') { result = result + "p"; }
			else if (character == 'g') { result = result + "q"; }
			else if (character == 'h') { result = result + "r"; }
			else if (character == 'i') { result = result + "s"; }
			else if (character == 'j') { result = result + "t"; }
			else if (character == 'k') { result = result + "u"; }
			else if (character == 'l') { result = result + "v"; }
			else if (character == 'm') { result = result + "w"; }
			else if (character == 'n') { result = result + "x"; }
			else if (character == 'o') { result = result + "y"; }
			else if (character == 'p') { result = result + "z"; }
			else if (character == 'q') { result = result + "a"; }
			else if (character == 'r') { result = result + "b"; }
			else if (character == 's') { result = result + "c"; }
			else if (character == 't') { result = result + "d"; }
			else if (character == 'u') { result = result + "e"; }
			else if (character == 'v') { result = result + "f"; }
			else if (character == 'w') { result = result + "g"; }
			else if (character == 'x') { result = result + "h"; }
			else if (character == 'y') { result = result + "i"; }
			else if (character == 'z') { result = result + "j"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
}
