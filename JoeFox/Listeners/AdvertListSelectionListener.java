package JoeFox.Listeners;

import javax.swing.*;
import javax.swing.event.*;
import JoeFox.Templates.Adverts.Advert;

public class AdvertListSelectionListener implements ListSelectionListener {

    public void valueChanged (ListSelectionEvent e) {
        JList list      = (JList) e.getSource ();
        ListModel model = list.getModel ();
        Advert advert   = (Advert) model.getElementAt (e.getFirstIndex ());

        //Open a new gui displaying the advert details
    }
}