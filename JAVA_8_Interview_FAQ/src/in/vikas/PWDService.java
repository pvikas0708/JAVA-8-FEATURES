package in.vikas;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PWDService {

	public static void main(String[] args) throws Exception {

		String pwd = "vikas@123";
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(pwd.getBytes());
		String encrypted = new String(digest);
		System.out.println(encrypted);
		
		Encoder encoder=Base64.getEncoder();
		byte[] encode = encoder.encode(digest);
		System.out.println("Encrypted + Encoded ::"+ new String(encode));

		/*Encoder encoder = Base64.getEncoder();

		// converting String to byte[] and passing as input for encode( ) method
		byte[] encode = encoder.encode(pwd.getBytes());

		// Converting byte[] to String
		String encodedPwd = new String(encode);

		System.out.println(encodedPwd);

		Decoder decoder = Base64.getDecoder();

		byte[] decode = decoder.decode(encodedPwd);
		String decodedPwd = new String(decode);
		System.out.println(decodedPwd);*/

	}
}
/*
 * Output: dmlrYXNAMTIz vikas@123
 */
