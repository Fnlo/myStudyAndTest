package Fnlo.security;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

public class SM2Cipher extends CipherSpi{

	private int mode;
	private Key key;
	private byte[] in;
	
	@Override
	protected byte[] engineDoFinal(byte[] arg0, int arg1, int arg2)
			throws IllegalBlockSizeException, BadPaddingException {
		return implDoFinal();
	}

	@Override
	protected int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4)
			throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
		return 0;
	}

	@Override
	protected int engineGetBlockSize() {
		return 0;
	}

	@Override
	protected byte[] engineGetIV() {
		return null;
	}

	@Override
	protected int engineGetOutputSize(int arg0) {
		return 0;
	}

	@Override
	protected AlgorithmParameters engineGetParameters() {
		return null;
	}

	@Override
	protected void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
		implInit(arg0, arg1);
	}

	@Override
	protected void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3)
			throws InvalidKeyException, InvalidAlgorithmParameterException {
		implInit(arg0, arg1);
	}

	@Override
	protected void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3)
			throws InvalidKeyException, InvalidAlgorithmParameterException {
		implInit(arg0, arg1);
	}

	@Override
	protected void engineSetMode(String arg0) throws NoSuchAlgorithmException {
		
	}

	@Override
	protected void engineSetPadding(String arg0) throws NoSuchPaddingException {
		
	}

	@Override
	protected byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
		return implUpdate(arg0, arg1, arg2);
	}

	@Override
	protected int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
		// TODO Auto-generated method stub
		return 0;
	}

	private void implInit(int mode, Key key) {
		this.mode = mode;
		if(key instanceof SM2Key) {
			this.key = key;
		} else {
			throw new RuntimeException("Unsupport key type.");
		}
	}
	
	private byte[] implUpdate(byte[] in, int offset, int len) {
		this.in = in;
		return in;
	}
	
	private byte[] implDoFinal() {
		SM2Key sm2Key = (SM2Key) key;
		if(mode == Cipher.ENCRYPT_MODE) {
			//TODO encrypt the in
			
		} else if (mode == Cipher.DECRYPT_MODE) {
			//TODO decrypt the in
			
		} else {
			throw new RuntimeException("mode must be encrypt or decrypt!");
		}
		return in;
	}
	
	public void init(int mode, Key key) {
		implInit(mode, key);
	}
	
	public void update(byte[] in, int offset, int len) {
		implUpdate(in, offset, len);
	}
	
	public byte[] doFinal() {
		return implDoFinal();
	}
}
