package Fnlo.security;

import java.security.Security;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestProvider {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SecureProvider provider = new SecureProvider();
		Security.addProvider(provider);
		KeyGenerator generator = KeyGenerator.getInstance("SM2", provider);
		System.out.println(generator);
		SecretKey secretKey = generator.generateKey();
		
		System.out.println(Arrays.toString(secretKey.getEncoded()));
		
		byte[] plain = "password".getBytes();
		System.out.println(Arrays.toString(plain));
		Cipher cipher = Cipher.getInstance("Simple");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		cipher.update(plain);
		byte[] result = cipher.doFinal();
		
		
		
	}

}
