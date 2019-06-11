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
			else if (character == 'b') { result = result + "y"; }
			else if (character == 'c') { result = result + "z"; }
			else if (character == 'd') { result = result + "a"; }
			else if (character == 'e') { result = result + "b"; }
			else if (character == 'f') { result = result + "c"; }
			else if (character == 'g') { result = result + "d"; }
			else if (character == 'h') { result = result + "e"; }
			else if (character == 'i') { result = result + "f"; }
			else if (character == 'j') { result = result + "g"; }
			else if (character == 'k') { result = result + "h"; }
			else if (character == 'l') { result = result + "i"; }
			else if (character == 'm') { result = result + "j"; }
			else if (character == 'n') { result = result + "k"; }
			else if (character == 'o') { result = result + "l"; }
			else if (character == 'p') { result = result + "m"; }
			else if (character == 'q') { result = result + "n"; }
			else if (character == 'r') { result = result + "o"; }
			else if (character == 's') { result = result + "p"; }
			else if (character == 't') { result = result + "q"; }
			else if (character == 'u') { result = result + "r"; }
			else if (character == 'v') { result = result + "s"; }
			else if (character == 'w') { result = result + "t"; }
			else if (character == 'x') { result = result + "u"; }
			else if (character == 'y') { result = result + "v"; }
			else if (character == 'z') { result = result + "w"; }
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
			else if (character == 'y') { result = result + "b"; }
			else if (character == 'z') { result = result + "c"; }
			else if (character == 'a') { result = result + "d"; }
			else if (character == 'b') { result = result + "e"; }
			else if (character == 'c') { result = result + "f"; }
			else if (character == 'd') { result = result + "g"; }
			else if (character == 'e') { result = result + "h"; }
			else if (character == 'f') { result = result + "i"; }
			else if (character == 'g') { result = result + "j"; }
			else if (character == 'h') { result = result + "k"; }
			else if (character == 'i') { result = result + "l"; }
			else if (character == 'j') { result = result + "m"; }
			else if (character == 'k') { result = result + "n"; }
			else if (character == 'l') { result = result + "o"; }
			else if (character == 'm') { result = result + "p"; }
			else if (character == 'n') { result = result + "q"; }
			else if (character == 'o') { result = result + "r"; }
			else if (character == 'p') { result = result + "s"; }
			else if (character == 'q') { result = result + "t"; }
			else if (character == 'r') { result = result + "u"; }
			else if (character == 's') { result = result + "v"; }
			else if (character == 't') { result = result + "w"; }
			else if (character == 'u') { result = result + "x"; }
			else if (character == 'v') { result = result + "y"; }
			else if (character == 'w') { result = result + "z"; }
			else { result = result + String.valueOf(character); }
			
		}
		return result;
	}
	
}
