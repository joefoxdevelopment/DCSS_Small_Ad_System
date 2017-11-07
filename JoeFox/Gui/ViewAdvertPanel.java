package JoeFox.Gui;

import javax.swing.*;
import JoeFox.Gui.NamedPanel;

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

        //Static content for now
        JLabel content = new JLabel ("List of Adverts");
        content.setHorizontalAlignment (JLabel.CENTER);

        panel.add (content);

        return panel;
    }
}
