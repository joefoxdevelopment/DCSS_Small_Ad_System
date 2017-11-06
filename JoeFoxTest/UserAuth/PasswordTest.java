package JoeFoxTest.UserAuth;

import java.security.MessageDigest;
import java.security.SecureRandom;
import JoeFox.Exceptions.UserAuth.*;
import JoeFox.UserAuth.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PasswordTest
{
    Password password;

    @Before
    public void setUp () {
        PasswordFactory factory = new PasswordFactory ();
        this.password = factory.create ();
    }

    @Test
    public void testInvalidPasswordThrowsInvalidPasswordException ()
    {
        try {
            this.password.setPassword ("Four");
            fail ("No InvalidPasswordException thrown.");
        } catch (Exception e) {
            assertThat(e, instanceOf (InvalidPasswordException.class));
        }
    }

    @Test
    public void testNoExceptionThrownWhenPasswordEncryptedSuccessfully () {
        try {
            this.password.setPassword ("ValidPassword");
        } catch (Exception e) {
            fail ("No exception should be thrown.");
        }
    }

    @Test
    public void testCheckPasswordThrowsNoSuchPasswordExceptionWhenNotSet () {
        try {
            this.password.checkPassword ("ValidPassword");
            fail ("No NoSuchPasswordException thrown.");
        } catch (Exception e) {
            assertThat(e, instanceOf (NoSuchPasswordException.class));
        }
    }

    @Test
    public void testCheckPasswordThrowsInvalidAttemptExceptionWhenNoMatch () {
        try {
            this.password.setPassword ("ValidPassword");
            this.password.checkPassword ("NotTheSame");
            fail ("Test fails if no InvalidAttemptException is thrown.");
        } catch (Exception e) {
            assertThat(e, instanceOf (InvalidAttemptException.class));
        }
    }

    @Test
    public void testNoExceptionThrownWhenAttemptMatchesStoredPassword () {
        try {
            this.password.setPassword ("ValidPassword");
            this.password.checkPassword ("ValidPassword");
        } catch (Exception e) {
            e.printStackTrace ();
            fail ("No exception should be thrown.");
        }
    }
}
