/*H****************************************************************
* FILENAME :        ROT10.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using ROT10 cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    6 Jun 19
*
*H*/

public class ROT10 {
	
	public static String ROT10_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "k"; }
			else if (character == 'b') { result += "l"; }
			else if (character == 'c') { result += "m"; }
			else if (character == 'd') { result += "n"; }
			else if (character == 'e') { result += "o"; }
			else if (character == 'f') { result += "p"; }
			else if (character == 'g') { result += "q"; }
			else if (character == 'h') { result += "r"; }
			else if (character == 'i') { result += "s"; }
			else if (character == 'j') { result += "t"; }
			else if (character == 'k') { result += "u"; }
			else if (character == 'l') { result += "v"; }
			else if (character == 'm') { result += "w"; }
			else if (character == 'n') { result += "x"; }
			else if (character == 'o') { result += "y"; }
			else if (character == 'p') { result += "z"; }
			else if (character == 'q') { result += "a"; }
			else if (character == 'r') { result += "b"; }
			else if (character == 's') { result += "c"; }
			else if (character == 't') { result += "d"; }
			else if (character == 'u') { result += "e"; }
			else if (character == 'v') { result += "f"; }
			else if (character == 'w') { result += "g"; }
			else if (character == 'x') { result += "h"; }
			else if (character == 'y') { result += "i"; }
			else if (character == 'z') { result += "j"; }
			else { result += String.valueOf(character); }
			
		}
		return result;
	}
	
}
