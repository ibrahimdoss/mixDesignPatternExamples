package facadeDesignPattern;

import facadeDesignPattern.EncryptorFacade.EncType;

public class CustomerEncryptor {
	
	public static void main (String[] args) {
		
		String text = "Content" ; 
		
		AESEncryptor aesEncryptor = new AESEncryptor();
		aesEncryptor.encrypt(text);
		
		MD5Encryptor md5Encryptor = new MD5Encryptor();
		md5Encryptor.encrypt(text);
		
		SHAEncryptor shaEncryptor = new SHAEncryptor();
		shaEncryptor.encrypt(text, text, true);
		
		EncryptorFacade encryptorFacade = new EncryptorFacade();
		encryptorFacade.encryptor(text, EncType.AES);
	}
}
