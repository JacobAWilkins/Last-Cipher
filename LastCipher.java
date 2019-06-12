/*H****************************************************************
* FILENAME :        LastCipher.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using various methods 
*
* NOTES :
*       First, pick encrypt or decrypt
*       Second, pick cipher type
*       Lastly, type your text
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    5 Jun 19
*
*H*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LastCipher {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean bool = true;
		int proc;
		int type;
		String text;
		String result = "";

		while(bool) {

			try {

				while(true) {
					System.out.println("1. Encrypt");
					System.out.println("2. Decrypt");
					System.out.println("3. Quit");
					System.out.print("Enter a Number: ");
					proc = Integer.parseInt(br.readLine());
					System.out.println();
					if (proc < 1 || proc > 3) {
						System.out.println("Number must be between 1-3\n");
					} else { break; }
				}

				if (proc == 3) {
					System.out.println("Exiting...");
					System.exit(0);
				}

				while (true) {
					System.out.println("1. A1Z26");
					System.out.println("2. Blowfish");
					System.out.println("3. ROT10");
					System.out.println("4. Abtash");
					System.out.println("5. Ceaser");
					System.out.println("6. Phone");
					System.out.println("7. Morse");
					System.out.println("8. Qwerty");
					System.out.println("9. Vigenere");
					System.out.println("10. AES");
					System.out.println("11. Baconian");
					System.out.println("12. Base64");
					System.out.print("Enter a Number: ");
					type = Integer.parseInt(br.readLine());
					System.out.println();
					if (type < 1 || type > 12) {
						System.out.println("Number must be between 1-12\n");
					} else { break; }
				}

				if (type == 7 && proc == 2) {
					System.out.println("When decrypting Morse code,");
					System.out.println("add a / between words and a space between letters\n");
				}

				System.out.print("Enter the data to encrypt/decrypt: ");
				text = br.readLine();
				System.out.println();

				switch (type) {
					case 1:
						A1Z26 code1 = new A1Z26();
						if (proc == 1) { result = code1.A1Z26_encrypt(text); }
						if (proc == 2) { result = code1.A1Z26_decrypt(text); }
						break;
					case 2:
						System.out.print("Enter a key: ");
						String pass2 = br.readLine();
						System.out.println();

						Blowfish code2 = new Blowfish();
						if (proc == 1) { result = code2.Blowfish_encrypt(text, pass2); }
						if (proc == 2) { result = code2.Blowfish_decrypt(text, pass2); }
						break;
					case 3:
						ROT10 code3 = new ROT10();
						result = code3.ROT10_encrypt(text);
						break;
					case 4:
						Abtash code4 = new Abtash();
						if (proc == 1) { result = code4.Abtash_encrypt(text); }
						if (proc == 2) { result = code4.Abtash_decrypt(text); }
						break;
					case 5:
						Ceaser code5 = new Ceaser();
						if (proc == 1) { result = code5.Ceaser_encrypt(text); }
						if (proc == 2) { result = code5.Ceaser_decrypt(text); }
						break;
					case 6:
						Phone code6 = new Phone();
						if (proc == 1) { result = code6.Phone_encrypt(text); }
						if (proc == 2) { result = code6.Phone_decrypt(text); }
						break;
					case 7:
						Morse code7 = new Morse();
						if (proc == 1) { result = code7.Morse_encrypt(text); }
						if (proc == 2) { result = code7.Morse_decrypt(text); }
						break;
					case 8:
						Qwerty code8 = new Qwerty();
						if (proc == 1) { result = code8.Qwerty_encrypt(text); }
						if (proc == 2) { result = code8.Qwerty_decrypt(text); }
						break;
					case 9:
						System.out.print("Enter a key: ");
						String key1 = br.readLine();
						System.out.println();

						Vigenere code9 = new Vigenere();
						if (proc == 1) { result = code9.Vigenere_encrypt(text, key1); }
						if (proc == 2) { result = code9.Vigenere_decrypt(text, key1); }
						break;
					case 10:
						System.out.print("Enter a key (must be 16 characters): ");
						String key2 = br.readLine();
						System.out.println();

						AES code10 = new AES();
						if (proc == 1) { result = code10.AES_encrypt(text, key2); }
						if (proc == 2) { result = code10.AES_decrypt(text, key2); }
						break;
					case 11:
						Baconian code11 = new Baconian();
						if (proc == 1) { result = code11.Baconian_encrypt(text); }
						if (proc == 2) { result = code11.Baconian_decrypt(text); }
						break;
					case 12:
						base64 code12 = new base64();
						if (proc == 1) { result = code12.Base64_encrypt(text); }
						if (proc == 2) { result = code12.Base64_decrypt(text); }
						break;
				}

				System.out.println("Result: " + result + "\n");

			} catch (IOException ioe) {

				System.out.println("Error reading data...");

			}

		}

	}

}
