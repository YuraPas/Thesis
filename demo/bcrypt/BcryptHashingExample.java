package demo.bcrypt;

import java.security.NoSuchAlgorithmException;

public class BcryptHashingExample 
{
	public static void main(String[] args) throws NoSuchAlgorithmException 
	{
		String  originalPassword = "password";
		long startTime = System.nanoTime();
	
		String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(16));
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;

		

		System.out.println("Execution time in milliseconds : " + 
								timeElapsed / 1000000);
		
		System.out.println(generatedSecuredPasswordHash);
		
		boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
		System.out.println(matched);
	}
}
