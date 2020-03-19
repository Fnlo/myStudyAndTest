package Fnlo.security;

import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;

public class SM2KeyGenerator extends KeyGeneratorSpi{

	private SecureRandom random = new SecureRandom();
	private int keySize = 128;
	private int offset = 3;
	
	@Override
	protected SecretKey engineGenerateKey() {
		// TODO Auto-generated method stub
		offset = random.nextInt();
		return new SM2Key(keySize, random, offset);
	}

	@Override
	protected void engineInit(SecureRandom var1) {
		// TODO Auto-generated method stub
		this.random = var1;
	}

	@Override
	protected void engineInit(AlgorithmParameterSpec var1, SecureRandom var2)
			throws InvalidAlgorithmParameterException {
		// TODO Auto-generated method stub
		throw new InvalidAlgorithmParameterException("Unsupport operation.");
	}

	@Override
	protected void engineInit(int var1, SecureRandom var2) {
		// TODO Auto-generated method stub
		this.keySize = var1;
		this.random = var2;
	}
	
}
