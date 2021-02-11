/*H****************************************************************
* FILENAME :        Qwerty.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using Qwerty cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    6 Jun 19
*
*H*/

public class Qwerty {
	
	public static String Qwerty_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result += "q"; }
			else if (character == 'b') { result += "w"; }
			else if (character == 'c') { result += "e"; }
			else if (character == 'd') { result += "r"; }
			else if (character == 'e') { result += "t"; }
			else if (character == 'f') { result += "y"; }
			else if (character == 'g') { result += "u"; }
			else if (character == 'h') { result += "i"; }
			else if (character == 'i') { result += "o"; }
			else if (character == 'j') { result += "p"; }
			else if (character == 'k') { result += "a"; }
			else if (character == 'l') { result += "s"; }
			else if (character == 'm') { result += "d"; }
			else if (character == 'n') { result += "f"; }
			else if (character == 'o') { result += "g"; }
			else if (character == 'p') { result += "h"; }
			else if (character == 'q') { result += "j"; }
			else if (character == 'r') { result += "k"; }
			else if (character == 's') { result += "l"; }
			else if (character == 't') { result += "z"; }
			else if (character == 'u') { result += "x"; }
			else if (character == 'v') { result += "c"; }
			else if (character == 'w') { result += "v"; }
			else if (character == 'x') { result += "b"; }
			else if (character == 'y') { result += "n"; }
			else if (character == 'z') { result += "m"; }
			else { result += String.valueOf(character); }
			
		}
		return result;
	}
	
	public static String Qwerty_decrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'q') { result += "a"; }
			else if (character == 'w') { result += "b"; }
			else if (character == 'e') { result += "c"; }
			else if (character == 'r') { result += "d"; }
			else if (character == 't') { result += "e"; }
			else if (character == 'y') { result += "f"; }
			else if (character == 'u') { result += "g"; }
			else if (character == 'i') { result += "h"; }
			else if (character == 'o') { result += "i"; }
			else if (character == 'p') { result += "j"; }
			else if (character == 'a') { result += "k"; }
			else if (character == 's') { result += "l"; }
			else if (character == 'd') { result += "m"; }
			else if (character == 'f') { result += "n"; }
			else if (character == 'g') { result += "o"; }
			else if (character == 'h') { result += "p"; }
			else if (character == 'j') { result += "q"; }
			else if (character == 'k') { result += "r"; }
			else if (character == 'l') { result += "s"; }
			else if (character == 'z') { result += "t"; }
			else if (character == 'x') { result += "u"; }
			else if (character == 'c') { result += "v"; }
			else if (character == 'v') { result += "w"; }
			else if (character == 'b') { result += "x"; }
			else if (character == 'n') { result += "y"; }
			else if (character == 'm') { result += "z"; }
			else { result += String.valueOf(character); }
			
		}
		return result;
	}
	
}
