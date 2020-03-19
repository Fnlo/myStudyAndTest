package Fnlo.security;

import java.security.AccessController;
import java.security.AuthProvider;
import java.security.PrivilegedAction;
import java.security.SecurityPermission;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;

public class SecureProvider extends AuthProvider{

	private static String name = "SecureProvider";
	private static String info = "this is test provider for sm2/sm3";
	private static double version = 1.0d;
	private static final long serialVersionUID = 1L;
	
	public SecureProvider() {
		super(name, version, info);
		AccessController.doPrivileged(new PrivilegedAction<Object>() {

			@Override
			public Object run() {
				//format: type--algorithm
				put("Cipher.SM2", "com.main.java.Fnlo.security.SM2Cipher");
				put("KeyGenerator.SM2", "com.main.java.Fnlo.security.SM2KeyGenerator");
				return null;
			}
			
		});
		
	}

	public String getName() {
		return name;
	}

	public String getInfo() {
		return info;
	}
	
	public double getVersion() {
		return version;
	}



	@Override
	public void login(Subject var1, CallbackHandler var2) throws LoginException {
		SecurityManager sm = System.getSecurityManager();
		sm.checkPermission(new SecurityPermission("authProvider." + this.getName()));
	}

	@Override
	public void logout() throws LoginException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCallbackHandler(CallbackHandler var1) {
		// TODO Auto-generated method stub
		
	}

}
