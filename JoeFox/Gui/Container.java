package JoeFox.Gui;

import java.util.ArrayList;
import javax.swing.*;
import JoeFox.Exceptions.Gui.NoPanelNameException;
import JoeFox.Exceptions.Gui.NoPanelsException;
import JoeFox.Gui.NamedPanel;

public class Container extends JFrame {

    private ArrayList<NamedPanel> panels;
    private JPanel appPanel;
    private JTabbedPane tabs;

    public Container (ArrayList<NamedPanel> panels) {
        super ("Adverts");

        this.panels = panels;
        this.tabs   = new JTabbedPane ();

        try {
            this.drawGui ();
        } catch (NoPanelsException e) {
            e.printStackTrace ();
            System.exit (1);
        }

        this.frameOpts ();
    }

    private void frameOpts () {
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        this.pack ();
        this.setVisible (true);
    }

    private void drawGui () throws NoPanelsException {
        if (this.panels.isEmpty ()) {
            throw new NoPanelsException ();
        }

        for (NamedPanel panel: panels) {
            this.addPanel (panel);
        }

        this.appPanel = new JPanel ();
        this.appPanel.add (this.tabs);

        this.add (appPanel);
    }

    private void addPanel (NamedPanel panel) {
        try {
            this.tabs.addTab (panel.getName (), panel.renderPanel ());
        } catch (NoPanelNameException e) {
            e.printStackTrace ();
            System.exit (1);
        }
    }

}
