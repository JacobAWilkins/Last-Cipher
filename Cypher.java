import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Cypher {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean bool = true;
		int proc;
		int type;
		String text;
		String result = "";
		
		while(bool) {
			
			try {
				
				System.out.println("1. Encrypt");
				System.out.println("2. Decrypt");
				System.out.println("3. Quit");
				System.out.print("Enter a Number: ");
				proc = Integer.parseInt(br.readLine());
				System.out.println();
				
				if (proc == 3) {
					System.out.println("Exiting...");
					System.exit(0);
				}
			
				System.out.println("1. A1Z26");
				System.out.print("Enter a Number: ");
				type = Integer.parseInt(br.readLine());
				System.out.println();
			
				System.out.print("Enter the text to encrypt/decrypt: ");
				text = br.readLine();
				System.out.println();
			
				switch (type) {
					case 1:
						A1Z26 code = new A1Z26();
						if (proc == 1) { result = code.A1Z26_encrypt(text); }
						if (proc == 2) { result = code.A1Z26_decrypt(text); }
						break;
					
				}
				System.out.println("Result: " + result + "\n");
				
			} catch (IOException ioe) {
				System.out.println("Error reading data..");
			}
			
		}
		
	}
	
}
