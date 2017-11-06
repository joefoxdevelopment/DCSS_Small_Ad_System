package JoeFoxTest.Exceptions.UserAuth;

import JoeFox.Exceptions.UserAuth.NoSuchPasswordException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NoSuchPasswordExceptionTest {

    private NoSuchPasswordException exception;

    @Before
    public void setUp () {
        this.exception = new NoSuchPasswordException();
    }

    @Test
    public void testNoSuchPasswordExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}