package JoeFox.Space;

import javax.swing.DefaultListModel;
import JoeFox.Templates.Adverts.Advert;

public class AdvertRetriever {

    //This will be replaced with code to retrieve the adverts from
    //the space, but for building the gui it'll do
    public DefaultListModel<Advert> getCurrentAdverts () {
        DefaultListModel<Advert> adverts = new DefaultListModel<Advert> ();
        for (int i = 0; i < 15; i++) {
            adverts.addElement (
                new Advert (
                    Integer.toString (i),
                    Integer.toString (i),
                    (float) i
            ));
        }
        return adverts;
    }
}
