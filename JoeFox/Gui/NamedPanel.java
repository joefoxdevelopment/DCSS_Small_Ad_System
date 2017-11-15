package JoeFox.Gui;

import javax.swing.JPanel;
import JoeFox.Exceptions.Gui.NoPanelNameException;
import JoeFox.Exceptions.Gui.InvalidPanelNameException;

public class NamedPanel {

    public String name;

    public NamedPanel (String name) {
        try {
            this.setName (name);
        } catch (InvalidPanelNameException e) {
            e.printStackTrace ();
            System.exit (1);
        }
    }

    public void setName (String name) throws InvalidPanelNameException {
        if (null == name || name.equals ("")) {
            throw new InvalidPanelNameException (
                "New panel name is invalid. Use a non empty string."
            );
        }
        this.name = name;
    }

    public String getName () throws NoPanelNameException {
        if (null == this.name || this.name.equals ("")) {
            throw new NoPanelNameException (
                this.getClass () + " called without having a set name."
            );
        }
        return this.name;
    }

    public JPanel renderPanel () {
        System.out.println ("This should be overridden by subclasses.");
        return new JPanel ();
    }
}
