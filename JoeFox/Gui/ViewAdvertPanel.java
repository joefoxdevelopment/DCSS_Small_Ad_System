package JoeFox.Gui;

import javax.swing.*;
import JoeFox.Gui.NamedPanel;
import JoeFox.Space.AdvertRetriever;
import JoeFox.Templates.Adverts.Advert;

public class ViewAdvertPanel
    extends NamedPanel
    implements RenderPanelInterface {

    public ViewAdvertPanel (String name) {
        super (name);
    }

    @Override
    public JPanel renderPanel () {
        JPanel panel = new JPanel ();
        //panel.setLayout ();               //Choose a layout

        AdvertRetriever retriever = new AdvertRetriever ();

        DefaultListModel<Advert> advertList = retriever.getCurrentAdverts ();
        JList list = new JList<Advert> (advertList);
        list.setVisibleRowCount (10);

        JScrollPane advertListScroller = new JScrollPane (list);

        panel.add (advertListScroller);

        return panel;
    }
}
