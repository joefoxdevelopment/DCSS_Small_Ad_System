package JoeFoxTest.Exceptions.Gui;

import JoeFox.Exceptions.Gui.NoPanelsException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NoPanelsExceptionTest extends Exception {

    private NoPanelsExceptionTest exception;

    @Before
    public void setUp () {
        this.exception = new NoPanelsExceptionTest();
    }

    @Test
    public void testNoPanelsExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}
