package JoeFox.Listeners;

import javax.swing.*;
import javax.swing.event.*;
import JoeFox.Models.AdvertListModel;
import JoeFox.Templates.Adverts.Advert;
import JoeFox.Gui.*;

public class AdvertListSelectionListener implements ListSelectionListener {

    public void valueChanged (ListSelectionEvent e) {
        JList list            = (JList) e.getSource ();
        AdvertListModel model = (AdvertListModel) list.getModel ();
        Advert advert         = (Advert) model.getElementAt (
            e.getFirstIndex ()
        );

        //Open a new gui displaying the advert details
        ShowAdvertPanel panel = new ShowAdvertPanel (
            "Show Advert",
            advert
        );

        JFrame frame = new JFrame ();
        frame.add (panel.renderPanel ());
        frame.pack ();
        frame.setVisible (true);

        //Replace the list index with the updated advert.
        model.set (e.getFirstIndex (), advert);
    }
}
