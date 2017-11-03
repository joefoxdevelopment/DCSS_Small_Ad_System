package JoeFoxTest.Templates.UserAuth;

import JoeFox.Templates.Template;
import JoeFox.Templates.UserAuth.User;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class UserTest
{
    private User user;

    @Before
    public void setUp () {
        user = new User();
    }

    @Test
    public void testUserExtendsTemplate () {
        assertThat(this.user, instanceOf (Template.class));
    }

    @Test
    public void testSetUsernameSetsTheUsername () {
        this.user.setUsername (new String ("John Doe"));
        assertEquals (this.user.username, new String ("John Doe"));
    }

    /**
     * This test will need rewriting for when hashing has been added.
     */
    @Test
    public void testSetPasswordSetsThePassHash () {
        this.user.setPassword (new String ("p45sW0rD"));
        assertEquals (this.user.passHash, new String ("p45sW0rD"));
    }

    @Test
    public void testArgsConstructorSetsUsernameAndPassword () {
        user = new User (new String ("John Doe"), new String ("p45sW0rD"));
        assertEquals (user.username, new String ("John Doe"));
        assertEquals (user.passHash, new String ("p45sW0rD"));
    }
}
