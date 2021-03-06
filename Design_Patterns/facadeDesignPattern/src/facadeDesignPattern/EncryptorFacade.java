package facadeDesignPattern;

public class EncryptorFacade {

	AESEncryptor aesEncryptor = new AESEncryptor();

	MD5Encryptor md5Encryptor = new MD5Encryptor();

	SHAEncryptor shaEncryptor = new SHAEncryptor();

	public void encryptor(String text, EncType encType) {

		switch (encType) {
		case AES:
			aesEncryptor.encrypt(text);
			break;
		case MD5:
			md5Encryptor.encrypt(text);
			break;
		case SHA:
			shaEncryptor.encrypt(text, text, true);
			break;
		default:
			throw new IllegalArgumentException(encType.toString());

		}

	}

	public enum EncType {

		SHA, MD5, AES
	}
}
