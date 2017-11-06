package JoeFox.UserAuth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import JoeFox.Factories.FactoryInterface;
import JoeFox.UserAuth.Password;

public class PasswordFactory implements FactoryInterface {

	public Password create () {
        MessageDigest digest = null;
        try {
             digest = MessageDigest.getInstance ("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
            System.exit (1);
        }

        SecureRandom random = null;
        try {
            random = SecureRandom.getInstance ("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
            System.exit (1);
        }

		return new Password (digest, random);
	}
}