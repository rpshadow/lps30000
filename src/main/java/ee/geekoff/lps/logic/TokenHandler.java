package ee.geekoff.lps.logic;

import java.math.BigInteger;
import java.security.SecureRandom;

public class TokenHandler {
	

	public String nextToken() {
		SecureRandom random = new SecureRandom();
		String token = new BigInteger(130, random).toString(32);
		this.wirteTokenToDb(token);
		
		return token;
	}
	
	public boolean wirteTokenToDb(String token) {
		// db write
		boolean result = true;
		return result;
	}
	
	public boolean checkToken(String token) {
		// db check
		return this.getTokenFromDb(token);
	}
	
	public boolean getTokenFromDb(String token) {
		//db read
		boolean result = true;
		
		return result;
	}
}