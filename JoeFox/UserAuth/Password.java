package JoeFox.UserAuth;

import java.security.MessageDigest;
import java.security.SecureRandom;
import JoeFox.Exceptions.UserAuth.*;

public class Password
{
    private byte[] salt;

    private MessageDigest digest;
    private SecureRandom random;
    private String passhash;

    private static final int PASSWORD_MIN_LENGTH = 8;
    private static final int PASSWORD_SEED_LIMIT = 999999999;

    public Password (MessageDigest digest, SecureRandom random) {
        this.digest = digest;
        this.random = random;
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

        if (!this.passhash.equals (
            this.hashPassword (attempt.getBytes (), this.salt)
        )) {
            throw new InvalidAttemptException ();
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

    private void assertPasswordValid (
        String password
    ) throws InvalidPasswordException {
        if (PASSWORD_MIN_LENGTH > password.length()) {
            throw new InvalidPasswordException (
                "Password shorter than 8 characters"
            );
        }
    }

    private void generateSalt () {
        byte[] salt = new byte[24];
        random.nextBytes (salt);
        this.salt = salt;
    }

    private String hashPassword (byte[] password, byte[] salt) {

        this.digest.update (salt);

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
