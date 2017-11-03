package JoeFox.UserAuth;

import java.security.MessageDigest;
import java.security.SecureRandom;
import JoeFox.Exceptions.UserAuth.InvalidPasswordException;

public class Password
{
    private String passhash;
    private byte[] salt;

    private static final int PASSWORD_MIN_LENGTH = 8;
    private static final int PASSWORD_SEED_LIMIT = 999999999;

    public Password () {}

    public Password (String password) throws InvalidPasswordException {
        try {
            this.setPassword (password);
        } catch (InvalidPasswordException e) {
            throw e;
        }
    }

    public void setPassword (String password) throws InvalidPasswordException {
        try {
            this.passhash = this.encryptPassword (password);
        } catch (InvalidPasswordException e) {
            throw e;
        }
    }

    private void assertPasswordValid (
        String password
    ) throws InvalidPasswordException {
        if (PASSWORD_MIN_LENGTH > password.length()) {
            throw new InvalidPasswordException (
                "Password shorter than 8 characters"
            );
        }
    }

    private String encryptPassword (
        String password
    ) throws InvalidPasswordException {
        try {
            this.assertPasswordValid (password);
        } catch (InvalidPasswordException e) {
            throw e;
        }

        if (null == this.salt) {
            this.salt = this.generateSalt ();
        }

        this.passhash = this.hashPassword (password.getBytes ());
    }

    private byte[] generateSalt () {
        SecureRandom random = SecureRandom.getInstance ("SHA1PRNG");
        byte[] salt         = new byte[24];
        random.nextBytes (salt);
        return salt;
    }

    private String hashPassword (byte[] password) {
        MessageDigest digest = new MessageDigest ();
        try {
            MessageDigest digest = MessageDigest.getInstance ("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            MessageDigest digest = new MessageDigest ();
        }

        digest.update (this.salt);

        byte[] bytes          = digest.digest (password);
        StringBuilder builder = new StringBuilder();

        for(int i=0; i< bytes.length ;i++)
        {
            builder.append (
                Integer.toString ((bytes[i] & 0xff) + 0x100, 16).substring (1)
            );
        }
        return builder.toString();
    }
}
