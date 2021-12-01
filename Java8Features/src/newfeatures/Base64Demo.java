package newfeatures;

import java.util.Base64;
import java.util.Scanner;

//Java program to encrypt and decrypt data
public class Base64Demo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String userName, password;
		System.out.println("****Wlcm to Cof Tech****");
		System.out.println("Enter ur username: ");
		userName=s.next();
		
		System.out.println("Enter ur password: ");
		password=s.next();
		
		//encoding the string to base64 format
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		
		System.out.println("Login successfull!");
		System.out.println("Username: "+userName);
		System.out.println("Password: "+encodedPassword);
		
		System.out.println("****Decrypt the password****");
		//decode Base64 format to String
		String decodedPassword=new String(Base64.getDecoder().decode(encodedPassword));
		System.out.println("The password is: "+decodedPassword);
		
		System.out.println("****URL Encoding****");
		
		Base64.Encoder encoder=Base64.getUrlEncoder();
		String eURL=encoder.encodeToString("https://www.coforge.com/industries/public-sector".getBytes());
		System.out.println("Encoded URL: "+eURL);
		
		String dURL=new String(Base64.getUrlDecoder().decode(eURL));
		System.out.println("Decoded URL: "+dURL);
		
			
		
		
		
	}

}
