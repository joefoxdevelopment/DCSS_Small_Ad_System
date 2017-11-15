package JoeFox.Gui;

import java.awt.GridLayout;
import javax.swing.*;
import JoeFox.Templates.Adverts.*;

public class ShowAdvertPanel extends NamedPanel {

    private Advert advert;

    public ShowAdvertPanel (String name) {
        super (name);
    }

    public ShowAdvertPanel (String name, Advert advert) {
        super (name);

        this.advert = advert;
    }

    @Override
    public JPanel renderPanel () {
        JPanel panel = new JPanel (new GridLayout (0,2));

        panel.add (new JLabel ("Title: "));
        panel.add (new JLabel (advert.title));
        panel.add (new JLabel ("Description: "));
        panel.add (new JLabel (advert.description));
        panel.add (new JLabel ("Price: "));
        panel.add (new JLabel ("£" + String.format ("%.2f", advert.price)));

        return panel;
    }
}
