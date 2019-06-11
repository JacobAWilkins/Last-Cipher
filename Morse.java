/*H****************************************************************
* FILENAME :        Morse.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using Morse cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    6 Jun 19
*
*H*/

public class Morse {
	
	public static String Morse_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + ".- "; }
			else if (character == 'b') { result = result + "-... "; }
			else if (character == 'c') { result = result + "-.-. "; }
			else if (character == 'd') { result = result + "-.. "; }
			else if (character == 'e') { result = result + ". "; }
			else if (character == 'f') { result = result + "..-. "; }
			else if (character == 'g') { result = result + "--. "; }
			else if (character == 'h') { result = result + ".... "; }
			else if (character == 'i') { result = result + ".. "; }
			else if (character == 'j') { result = result + ".--- "; }
			else if (character == 'k') { result = result + "-.- "; }
			else if (character == 'l') { result = result + ".-.. "; }
			else if (character == 'm') { result = result + "-- "; }
			else if (character == 'n') { result = result + "-. "; }
			else if (character == 'o') { result = result + "--- "; }
			else if (character == 'p') { result = result + ".--. "; }
			else if (character == 'q') { result = result + "--.- "; }
			else if (character == 'r') { result = result + ".-. "; }
			else if (character == 's') { result = result + "... "; }
			else if (character == 't') { result = result + "- "; }
			else if (character == 'u') { result = result + "..- "; }
			else if (character == 'v') { result = result + "...- "; }
			else if (character == 'w') { result = result + ".-- "; }
			else if (character == 'x') { result = result + "-..- "; }
			else if (character == 'y') { result = result + "-.-- "; }
			else if (character == 'z') { result = result + "--.. "; }
			else if (character == '.') { result = result + ".-.-.- "; }
			else if (character == ',') { result = result + "--..-- "; }
			else if (character == '?') { result = result + "..--.. "; }
			else if (character == '\'') { result = result + ".----. "; }
			else if (character == '!') { result = result + "-.-.-- "; }
			else if (character == '/') { result = result + "-..-. "; }
			else if (character == '-') { result = result + "-....- "; }
			else if (character == '(') { result = result + "-.--.- "; }
			else if (character == '"') { result = result + ".-..-. "; }
			else if (character == '1') { result = result + ".---- "; }
			else if (character == '2') { result = result + "..--- "; }
			else if (character == '3') { result = result + "...-- "; }
			else if (character == '4') { result = result + "....- "; }
			else if (character == '5') { result = result + "..... "; }
			else if (character == '6') { result = result + "-.... "; }
			else if (character == '7') { result = result + "--... "; }
			else if (character == '8') { result = result + "---.. "; }
			else if (character == '9') { result = result + "----. "; }
			else if (character == '0') { result = result + "----- "; }
			else if (character == ' ') { result = result + "/ "; }
			
		}
		return result;
	}
	
	public static String Morse_decrypt(String text) {
		String result = "";
		String[] tokens = text.split(" ");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals(".-")) { result = result + "a"; }
			else if (token.equals("-...")) { result = result + "b"; }
			else if (token.equals("-.-.")) { result = result + "c"; }
			else if (token.equals("-..")) { result = result + "d"; }
			else if (token.equals(".")) { result = result + "e"; }
			else if (token.equals("..-.")) { result = result + "f"; }
			else if (token.equals("--.")) { result = result + "g"; }
			else if (token.equals("....")) { result = result + "h"; }
			else if (token.equals("..")) { result = result + "i"; }
			else if (token.equals(".---")) { result = result + "j"; }
			else if (token.equals("-.-")) { result = result + "k"; }
			else if (token.equals(".-..")) { result = result + "l"; }
			else if (token.equals("--")) { result = result + "m"; }
			else if (token.equals("-.")) { result = result + "n"; }
			else if (token.equals("---")) { result = result + "o"; }
			else if (token.equals(".--.")) { result = result + "p"; }
			else if (token.equals("--.-")) { result = result + "q"; }
			else if (token.equals(".-.")) { result = result + "r"; }
			else if (token.equals("...")) { result = result + "s"; }
			else if (token.equals("-")) { result = result + "t"; }
			else if (token.equals("..-")) { result = result + "u"; }
			else if (token.equals("...-")) { result = result + "v"; }
			else if (token.equals(".--")) { result = result + "w"; }
			else if (token.equals("-..-")) { result = result + "x"; }
			else if (token.equals("-.--")) { result = result + "y"; }
			else if (token.equals("--..")) { result = result + "z"; }
			else if (token.equals(".-.-.-")) { result = result + "."; }
			else if (token.equals("--..--")) { result = result + ","; }
			else if (token.equals("..--..")) { result = result + "?"; }
			else if (token.equals(".----.")) { result = result + "'"; }
			else if (token.equals("-.-.--")) { result = result + "!"; }
			else if (token.equals("-..-.")) { result = result + "/"; }
			else if (token.equals("-....-")) { result = result + "-"; }
			else if (token.equals("-.--.-")) { result = result + "("; }
			else if (token.equals(".-..-.")) { result = result + "\""; }
			else if (token.equals(".----")) { result = result + "1"; }
			else if (token.equals("..---")) { result = result + "2"; }
			else if (token.equals("...--")) { result = result + "3"; }
			else if (token.equals("....-")) { result = result + "4"; }
			else if (token.equals(".....")) { result = result + "5"; }
			else if (token.equals("-....")) { result = result + "6"; }
			else if (token.equals("--...")) { result = result + "7"; }
			else if (token.equals("---..")) { result = result + "8"; }
			else if (token.equals("----.")) { result = result + "9"; }
			else if (token.equals("-----")) { result = result + "0"; }
			else if (token.equals("/")) { result = result + " "; }
		}
		return result;
	}
	
}
