/*H****************************************************************
* FILENAME :        Phone.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using Phone cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    6 Jun 19
*
*H*/

public class Phone {
	
	public static String Phone_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "21"; }
			else if (character == 'b') { result = result + "22"; }
			else if (character == 'c') { result = result + "23"; }
			else if (character == 'd') { result = result + "31"; }
			else if (character == 'e') { result = result + "32"; }
			else if (character == 'f') { result = result + "33"; }
			else if (character == 'g') { result = result + "41"; }
			else if (character == 'h') { result = result + "42"; }
			else if (character == 'i') { result = result + "43"; }
			else if (character == 'j') { result = result + "51"; }
			else if (character == 'k') { result = result + "52"; }
			else if (character == 'l') { result = result + "53"; }
			else if (character == 'm') { result = result + "61"; }
			else if (character == 'n') { result = result + "62"; }
			else if (character == 'o') { result = result + "63"; }
			else if (character == 'p') { result = result + "71"; }
			else if (character == 'q') { result = result + "72"; }
			else if (character == 'r') { result = result + "73"; }
			else if (character == 's') { result = result + "74"; }
			else if (character == 't') { result = result + "81"; }
			else if (character == 'u') { result = result + "82"; }
			else if (character == 'v') { result = result + "83"; }
			else if (character == 'w') { result = result + "91"; }
			else if (character == 'x') { result = result + "92"; }
			else if (character == 'y') { result = result + "93"; }
			else if (character == 'z') { result = result + "94"; }
			
			if (i != text.length() - 1) { result = result + "-"; }
		}
		return result;
	}
	
	public static String Phone_decrypt(String text) {
		String result = "";
		String[] tokens = text.split("-");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals("21")) { result = result + "a"; }
			else if (token.equals("22")) { result = result + "b"; }
			else if (token.equals("23")) { result = result + "c"; }
			else if (token.equals("31")) { result = result + "d"; }
			else if (token.equals("32")) { result = result + "e"; }
			else if (token.equals("33")) { result = result + "f"; }
			else if (token.equals("41")) { result = result + "g"; }
			else if (token.equals("42")) { result = result + "h"; }
			else if (token.equals("43")) { result = result + "i"; }
			else if (token.equals("51")) { result = result + "j"; }
			else if (token.equals("52")) { result = result + "k"; }
			else if (token.equals("53")) { result = result + "l"; }
			else if (token.equals("61")) { result = result + "m"; }
			else if (token.equals("62")) { result = result + "n"; }
			else if (token.equals("63")) { result = result + "o"; }
			else if (token.equals("71")) { result = result + "p"; }
			else if (token.equals("72")) { result = result + "q"; }
			else if (token.equals("73")) { result = result + "r"; }
			else if (token.equals("74")) { result = result + "s"; }
			else if (token.equals("81")) { result = result + "t"; }
			else if (token.equals("82")) { result = result + "u"; }
			else if (token.equals("83")) { result = result + "v"; }
			else if (token.equals("91")) { result = result + "w"; }
			else if (token.equals("92")) { result = result + "x"; }
			else if (token.equals("93")) { result = result + "y"; }
			else if (token.equals("94")) { result = result + "z"; }

		}
		return result;
	}
	
}
