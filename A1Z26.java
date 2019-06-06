public class A1Z26 {
	
	public static String A1Z26_encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character == 'a') { result = result + "1"; }
			else if (character == 'b') { result = result + "2"; }
			else if (character == 'c') { result = result + "3"; }
			else if (character == 'd') { result = result + "4"; }
			else if (character == 'e') { result = result + "5"; }
			else if (character == 'f') { result = result + "6"; }
			else if (character == 'g') { result = result + "7"; }
			else if (character == 'h') { result = result + "8"; }
			else if (character == 'i') { result = result + "9"; }
			else if (character == 'j') { result = result + "10"; }
			else if (character == 'k') { result = result + "11"; }
			else if (character == 'l') { result = result + "12"; }
			else if (character == 'm') { result = result + "13"; }
			else if (character == 'n') { result = result + "14"; }
			else if (character == 'o') { result = result + "15"; }
			else if (character == 'p') { result = result + "16"; }
			else if (character == 'q') { result = result + "17"; }
			else if (character == 'r') { result = result + "18"; }
			else if (character == 's') { result = result + "19"; }
			else if (character == 't') { result = result + "20"; }
			else if (character == 'u') { result = result + "21"; }
			else if (character == 'v') { result = result + "22"; }
			else if (character == 'w') { result = result + "23"; }
			else if (character == 'x') { result = result + "24"; }
			else if (character == 'y') { result = result + "25"; }
			else if (character == 'z') { result = result + "26"; }
			else if (character == ' ') { result = result + "0"; }
			
			if (i != text.length() - 1) { result = result + "-"; }
		}
		return result;
	}
	
	public static String A1Z26_decrypt(String text) {
		String result = "";
		String[] tokens = text.split("-");
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals("1")) { result = result + "a"; }
			else if (token.equals("2")) { result = result + "b"; }
			else if (token.equals("3")) { result = result + "c"; }
			else if (token.equals("4")) { result = result + "d"; }
			else if (token.equals("5")) { result = result + "e"; }
			else if (token.equals("6")) { result = result + "f"; }
			else if (token.equals("7")) { result = result + "g"; }
			else if (token.equals("8")) { result = result + "h"; }
			else if (token.equals("9")) { result = result + "i"; }
			else if (token.equals("10")) { result = result + "j"; }
			else if (token.equals("11")) { result = result + "k"; }
			else if (token.equals("12")) { result = result + "l"; }
			else if (token.equals("13")) { result = result + "m"; }
			else if (token.equals("14")) { result = result + "n"; }
			else if (token.equals("15")) { result = result + "o"; }
			else if (token.equals("16")) { result = result + "p"; }
			else if (token.equals("17")) { result = result + "q"; }
			else if (token.equals("18")) { result = result + "r"; }
			else if (token.equals("19")) { result = result + "s"; }
			else if (token.equals("20")) { result = result + "t"; }
			else if (token.equals("21")) { result = result + "u"; }
			else if (token.equals("22")) { result = result + "v"; }
			else if (token.equals("23")) { result = result + "w"; }
			else if (token.equals("24")) { result = result + "x"; }
			else if (token.equals("25")) { result = result + "y"; }
			else if (token.equals("26")) { result = result + "z"; }
			else if (token.equals("0")) { result = result + " "; }
		}
		return result;
	}
	
}
