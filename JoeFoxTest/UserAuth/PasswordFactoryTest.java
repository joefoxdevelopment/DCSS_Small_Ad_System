package JoeFoxTest.UserAuth;

import JoeFox.UserAuth.Password;
import JoeFox.UserAuth.PasswordFactory;
import JoeFox.Factories.FactoryInterface;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class PasswordFactoryTest {

	PasswordFactory factory;

	@Before
	public void setUp () {
		factory = new PasswordFactory ();
	}

	@Test
	public void testImplementsFactoryInterface () {
		assertThat (this.factory, instanceOf (FactoryInterface.class));
	}

	@Test
	public void testFactoryCreatesPassword () {
		assertThat (this.factory.create (), instanceOf (Password.class));
	}

}