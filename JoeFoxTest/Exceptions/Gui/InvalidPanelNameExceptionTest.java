package JoeFoxTest.Exceptions.Gui;

import JoeFox.Exceptions.Gui.InvalidPanelNameException;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class InvalidPanelNameExceptionTest extends Exception {

    private InvalidPanelNameExceptionTest exception;

    @Before
    public void setUp () {
        this.exception = new InvalidPanelNameExceptionTest();
    }

    @Test
    public void testInvalidPanelNameExceptionExtendsException () {
        assertThat(this.exception, instanceOf (Exception.class));
    }
}
