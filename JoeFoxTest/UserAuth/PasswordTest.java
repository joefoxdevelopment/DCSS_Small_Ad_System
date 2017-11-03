package JoeFoxTest.UserAuth;

import JoeFox.Exceptions.UserAuth.InvalidPasswordException;
import JoeFox.UserAuth.Password;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PasswordTest
{
    @Test
    public void testInvalidPasswordThrowsInvalidPasswordException ()
    {
        try {
            Password password = new Password ("Four");
            fail ("Test fails if no InvalidPasswordException thrown.");
        } catch (Exception e) {
            assertThat(e, instanceOf (InvalidPasswordException.class));
        }
    }
}
