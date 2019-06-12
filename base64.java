/*H****************************************************************
* FILENAME :        base64.java
*
* DESCRIPTION :
*       Encrypts and decrpyts text using Base64 cipher 
*
*       Copyright 2019, Jacob Wilkins.  All rights reserved.
* 
* AUTHOR :    Jacob Wilkins        START DATE :    11 Jun 19
*
*H*/

import java.util.Base64;

public class base64 {

  public static String Base64_encrypt(String text) {
  
		return Base64.getEncoder().encodeToString(text.getBytes());
    
	}

	public static String Base64_decrypt(String text) {
  
    byte[] result = Base64.getDecoder().decode(text);
		return new String(result);
    
	}

}
