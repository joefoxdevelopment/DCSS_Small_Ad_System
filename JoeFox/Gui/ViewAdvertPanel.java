package JoeFox.Gui;

import javax.swing.*;
import JoeFox.Gui.NamedPanel;
import JoeFox.Listeners.AdvertListSelectionListener;
import JoeFox.Space.AdvertRetriever;
import JoeFox.Templates.Adverts.Advert;

public class ViewAdvertPanel extends NamedPanel {

    public ViewAdvertPanel (String name) {
        super (name);
    }

    @Override
    public JPanel renderPanel () {
        JPanel panel                        = new JPanel ();
        AdvertRetriever retriever           = new AdvertRetriever ();
        DefaultListModel<Advert> advertList = retriever.getCurrentAdverts ();
        JList list                          = new JList<Advert> (advertList);
        list.setVisibleRowCount (10);
        list.setSelectionMode (ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.addListSelectionListener (new AdvertListSelectionListener ());

        JScrollPane advertListScroller = new JScrollPane (list);

        panel.add (advertListScroller);

        return panel;
    }
}
