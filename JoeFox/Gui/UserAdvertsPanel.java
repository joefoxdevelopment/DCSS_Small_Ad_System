package JoeFox.Gui;

import javax.swing.*;
import JoeFox.Gui.NamedPanel;
import JoeFox.Space.AdvertRetriever;
import JoeFox.Templates.Adverts.Advert;

public class UserAdvertsPanel
    extends NamedPanel
    implements RenderPanelInterface {

    public UserAdvertsPanel (String name) {
        super (name);
    }

    @Override
    public JPanel renderPanel () {
        JPanel panel                        = new JPanel ();
        JButton newAdButton                 = new JButton ("Add new Advert");
        AdvertRetriever retriever           = new AdvertRetriever ();
        DefaultListModel<Advert> advertList = retriever.getCurrentAdverts ();
        JList list                          = new JList<Advert> (advertList);
        list.setVisibleRowCount (10);

        JScrollPane advertListScroller = new JScrollPane (list);

        panel.add (advertListScroller);
        panel.add (newAdButton);

        return panel;
    }
}
