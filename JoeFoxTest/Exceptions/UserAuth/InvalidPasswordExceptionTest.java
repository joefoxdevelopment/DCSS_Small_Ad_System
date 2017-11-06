package JoeFoxTest.Exceptions.UserAuth;

import JoeFox.Exceptions.UserAuth.InvalidPasswordException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class InvalidPasswordExceptionTest {

    private InvalidPasswordException exception;

    @Before
    public void setUp () {
        this.exception = new InvalidPasswordException();
    }

    @Test
    public void testInvalidPasswordExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}