/*H****************************************************************
* FILENAME :        A1Z26.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using A1Z26 cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    5 Jun 19
*
*H*/

public class A1Z26 {
	
	public static String A1Z26_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "1"; }
			else if (character == 'b') { result += "2"; }
			else if (character == 'c') { result += "3"; }
			else if (character == 'd') { result += "4"; }
			else if (character == 'e') { result += "5"; }
			else if (character == 'f') { result += "6"; }
			else if (character == 'g') { result += "7"; }
			else if (character == 'h') { result += "8"; }
			else if (character == 'i') { result += "9"; }
			else if (character == 'j') { result += "10"; }
			else if (character == 'k') { result += "11"; }
			else if (character == 'l') { result += "12"; }
			else if (character == 'm') { result += "13"; }
			else if (character == 'n') { result += "14"; }
			else if (character == 'o') { result += "15"; }
			else if (character == 'p') { result += "16"; }
			else if (character == 'q') { result += "17"; }
			else if (character == 'r') { result += "18"; }
			else if (character == 's') { result += "19"; }
			else if (character == 't') { result += "20"; }
			else if (character == 'u') { result += "21"; }
			else if (character == 'v') { result += "22"; }
			else if (character == 'w') { result += "23"; }
			else if (character == 'x') { result += "24"; }
			else if (character == 'y') { result += "25"; }
			else if (character == 'z') { result += "26"; }
			else if (character == ' ') { result += "0"; }
			
			if (i != text.length() - 1) { result += "-"; }
		}
		return result;
	}
	
	public static String A1Z26_decrypt(String text) {
		String result = "";
		String[] tokens = text.split("-");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals("1")) { result += "a"; }
			else if (token.equals("2")) { result += "b"; }
			else if (token.equals("3")) { result += "c"; }
			else if (token.equals("4")) { result += "d"; }
			else if (token.equals("5")) { result += "e"; }
			else if (token.equals("6")) { result += "f"; }
			else if (token.equals("7")) { result += "g"; }
			else if (token.equals("8")) { result += "h"; }
			else if (token.equals("9")) { result += "i"; }
			else if (token.equals("10")) { result += "j"; }
			else if (token.equals("11")) { result += "k"; }
			else if (token.equals("12")) { result += "l"; }
			else if (token.equals("13")) { result += "m"; }
			else if (token.equals("14")) { result += "n"; }
			else if (token.equals("15")) { result += "o"; }
			else if (token.equals("16")) { result += "p"; }
			else if (token.equals("17")) { result += "q"; }
			else if (token.equals("18")) { result += "r"; }
			else if (token.equals("19")) { result += "s"; }
			else if (token.equals("20")) { result += "t"; }
			else if (token.equals("21")) { result += "u"; }
			else if (token.equals("22")) { result += "v"; }
			else if (token.equals("23")) { result += "w"; }
			else if (token.equals("24")) { result += "x"; }
			else if (token.equals("25")) { result += "y"; }
			else if (token.equals("26")) { result += "z"; }
			else if (token.equals("0")) { result += " "; }
		}
		return result;
	}
	
}
