package demo.scrypt;

import demo.helpers.SCryptUtil;

public class ScryptPasswordHashingDemo 
{
	public static void main(String[] args) {
		String originalPassword = "password";
		long startTime = System.nanoTime();
		
	
	String generatedSecuredPasswordHash = SCryptUtil.scrypt(originalPassword, 16, 16, 16);
		
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;

		

		System.out.println("Execution time in milliseconds : " + 
								timeElapsed / 1000000);
		System.out.println(generatedSecuredPasswordHash);
		
		boolean matched = SCryptUtil.check("password", generatedSecuredPasswordHash);
		System.out.println(matched);
		
		matched = SCryptUtil.check("passwordno", generatedSecuredPasswordHash);
		System.out.println(matched);
	}
}
