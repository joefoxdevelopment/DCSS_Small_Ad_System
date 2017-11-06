package JoeFoxTest.Templates.Adverts;

import JoeFox.Templates.Template;
import JoeFox.Templates.Adverts.Advert;
import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class AdvertTest
{
    public Advert advert;

    @Before
    public void setUp () {
        this.advert = new Advert ();
    }

    @Test
    public void testUserExtendsTemplate () {
        assertThat (this.advert, instanceOf (Template.class));
    }

    @Test
    public void testSetTitleUpdatesTitle () {
        this.advert.setTitle (new String ("Title"));
        assertEquals (this.advert.title, new String ("Title"));
    }

    @Test
    public void testSetDescriptionUpdatesDescription () {
        this.advert.setDescription (new String ("Description"));
        assertEquals (this.advert.description, new String ("Description"));
    }

    @Test
    public void testSetPriceUpdatesPrice () {
        this.advert.setPrice (new Float (2.50));
        assertEquals (this.advert.price, new Float (2.50));
    }

    @Test
    public void testArgsConstructorSetsTitleDescriptionAndPrice () {
        advert = new Advert (
            new String ("Title"),
            new String ("Description"),
            new Float (2.50)
        );
        assertEquals (this.advert.title, new String ("Title"));
        assertEquals (this.advert.description, new String ("Description"));
        assertEquals (this.advert.price, new Float (2.50));
    }
}
