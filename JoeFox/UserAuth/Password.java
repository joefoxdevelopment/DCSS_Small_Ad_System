package JoeFox.UserAuth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import JoeFox.Exceptions.UserAuth.InvalidAttemptException;
import JoeFox.Exceptions.UserAuth.InvalidPasswordException;
import JoeFox.Exceptions.UserAuth.NoSuchPasswordException;

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

    public void checkPassword (
        String attempt
        ) throws NoSuchPasswordException, InvalidAttemptException {
        if (null == this.passhash || null == this.salt) {
            throw new NoSuchPasswordException ();
        }

        if (!this.passhash.equals (attempt)) {
            throw new InvalidAttemptException ("Password is not " + attempt);
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
            this.generateSalt ();
        }

        return this.hashPassword (password.getBytes (), this.salt);
    }

    private void generateSalt () {
        SecureRandom random = null;
        try {
            random = SecureRandom.getInstance ("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
            System.exit (1);
        }
        byte[] salt         = new byte[24];
        random.nextBytes (salt);
        this.salt = salt;
    }

    private String hashPassword (byte[] password, byte[] salt) {
        MessageDigest digest = null;
        try {
             digest = MessageDigest.getInstance ("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace ();
            System.exit (1);
        }

        digest.update (salt);

        byte[] bytes          = digest.digest (password);
        StringBuilder builder = new StringBuilder();

        for(int i=0; i< bytes.length ;i++)
        {
            builder.append (
                Integer.toString (bytes[i])
            );
        }
        return builder.toString();
    }
}
