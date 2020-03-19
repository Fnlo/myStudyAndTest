package Fnlo.security;

import java.security.SecureRandom;

import javax.crypto.SecretKey;

public class SM2Key implements SecretKey{

	protected int len;
	protected SecureRandom random;
	protected int offset;
	
	public SM2Key(int len, SecureRandom random, int offset) {
		this.len = len;
		this.random = random;
		this.offset = offset;
	}

	@Override
	public String getAlgorithm() {
		return "SM2";
	}

	@Override
	public byte[] getEncoded() {
		byte[] b = new byte[len];
		random.nextBytes(b);
		return b;
	}

	@Override
	public String getFormat() {
		return "";
	}

}
