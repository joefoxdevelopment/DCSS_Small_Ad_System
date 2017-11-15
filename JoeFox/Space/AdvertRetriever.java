package JoeFox.Space;

import JoeFox.Models.AdvertListModel;
import JoeFox.Templates.Adverts.Advert;

public class AdvertRetriever {

    //This will be replaced with code to retrieve the adverts from
    //the space, but for building the gui it'll do
    public AdvertListModel<Advert> getCurrentAdverts () {
        AdvertListModel<Advert> adverts = new AdvertListModel<Advert> ();
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

    //Will be used to retrieve the current users adverts
    public AdvertListModel<Advert> getUserAdverts () {
        return new AdvertListModel<Advert> ();
    }
}
