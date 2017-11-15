package JoeFox.Gui;

import javax.swing.*;
import JoeFox.Templates.Adverts.*;

public class UpdateAdvertPanel extends NamedPanel {

    private Advert advert;

    public UpdateAdvertPanel (String name) {
        super (name);
    }

    public UpdateAdvertPanel (String name, Advert advert) {
        super (name);

        this.advert = advert;
    }

    @Override
    public JPanel renderPanel () {
        JPanel panel      = new JPanel ();
        JLabel titleLabel = new JLabel ("Title");
        JLabel descLabel  = new JLabel ("Description");
        JLabel priceLabel = new JLabel ("Price");

        panel.add (titleLabel);
        panel.add (descLabel);
        panel.add (priceLabel);

        return panel;
    }
}
