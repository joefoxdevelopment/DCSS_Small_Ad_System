package JoeFoxTest.Exceptions.Gui;

import JoeFox.Exceptions.Gui.NoPanelNameException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class NoPanelNameExceptionTest extends Exception {

    private NoPanelNameExceptionTest exception;

    @Before
    public void setUp () {
        this.exception = new NoPanelNameExceptionTest();
    }

    @Test
    public void testNoPanelNameExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}
