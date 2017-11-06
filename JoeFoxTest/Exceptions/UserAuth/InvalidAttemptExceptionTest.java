package JoeFoxTest.Exceptions.UserAuth;

import JoeFox.Exceptions.UserAuth.InvalidAttemptException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class InvalidAttemptExceptionTest {

    private InvalidAttemptException exception;

    @Before
    public void setUp () {
        this.exception = new InvalidAttemptException();
    }

    @Test
    public void testInvalidAttemptExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}