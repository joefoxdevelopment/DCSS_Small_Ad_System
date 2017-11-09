package JoeFox.Templates.Adverts;

import JoeFox.Templates.Template;

/**
 * Class JoeFox.Templates.Adverts.Advert
 *
 * A class utilised by the system to represent adverts and the relevant data
 *
 * @author Joe Fox
 * @version 1.0
 * @since 2017-10-31
 */

public class Advert extends Template
{
    /**
     * The title of the advert to be displayed
     */
    public String title;

    /**
     * A short description of the product being advertised
     */
    public String description;

    /**
     * The price of the advertised item
     */
    public Float price;

    /**
     * Noargs constructor required by javaspaces
     */
    public Advert () {}

    /**
     * Constructor for adverts to initialise title, description and price
     */
    public Advert (String title, String description, Float price) {
        this.title       = title;
        this.description = description;
        this.price       = price;
    }

    public void setTitle (String title) {
        //Throw exception if title empty
        this.title = title;
    }

    public void setDescription (String description) {
        //throw exception if description empty
        this.description = description;
    }

    public void setPrice (Float price) {
        //Throw exception if price negative
        this.price = price;
    }

    public String toString () {
        String output = new String ();
        output = String.format ("%s £%01.2f", this.title, this.price);
        return output;
    }
}
