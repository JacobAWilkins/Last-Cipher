/*H****************************************************************
* FILENAME :        Ceaser.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using Ceaser cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    6 Jun 19
*
*H*/

public class Ceaser {
	
	public static String Ceaser_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "x"; }
			else if (character == 'b') { result += "y"; }
			else if (character == 'c') { result += "z"; }
			else if (character == 'd') { result += "a"; }
			else if (character == 'e') { result += "b"; }
			else if (character == 'f') { result += "c"; }
			else if (character == 'g') { result += "d"; }
			else if (character == 'h') { result += "e"; }
			else if (character == 'i') { result += "f"; }
			else if (character == 'j') { result += "g"; }
			else if (character == 'k') { result += "h"; }
			else if (character == 'l') { result += "i"; }
			else if (character == 'm') { result += "j"; }
			else if (character == 'n') { result += "k"; }
			else if (character == 'o') { result += "l"; }
			else if (character == 'p') { result += "m"; }
			else if (character == 'q') { result += "n"; }
			else if (character == 'r') { result += "o"; }
			else if (character == 's') { result += "p"; }
			else if (character == 't') { result += "q"; }
			else if (character == 'u') { result += "r"; }
			else if (character == 'v') { result += "s"; }
			else if (character == 'w') { result += "t"; }
			else if (character == 'x') { result += "u"; }
			else if (character == 'y') { result += "v"; }
			else if (character == 'z') { result += "w"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
	public static String Ceaser_decrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'x') { result = result + "a"; }
			else if (character == 'y') { result += "b"; }
			else if (character == 'z') { result += "c"; }
			else if (character == 'a') { result += "d"; }
			else if (character == 'b') { result += "e"; }
			else if (character == 'c') { result += "f"; }
			else if (character == 'd') { result += "g"; }
			else if (character == 'e') { result += "h"; }
			else if (character == 'f') { result += "i"; }
			else if (character == 'g') { result += "j"; }
			else if (character == 'h') { result += "k"; }
			else if (character == 'i') { result += "l"; }
			else if (character == 'j') { result += "m"; }
			else if (character == 'k') { result += "n"; }
			else if (character == 'l') { result += "o"; }
			else if (character == 'm') { result += "p"; }
			else if (character == 'n') { result += "q"; }
			else if (character == 'o') { result += "r"; }
			else if (character == 'p') { result += "s"; }
			else if (character == 'q') { result += "t"; }
			else if (character == 'r') { result += "u"; }
			else if (character == 's') { result += "v"; }
			else if (character == 't') { result += "w"; }
			else if (character == 'u') { result += "x"; }
			else if (character == 'v') { result += "y"; }
			else if (character == 'w') { result += "z"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
}
