package JoeFox.Gui;

import java.util.ArrayList;
import JoeFox.Factories.FactoryInterface;
import JoeFox.Gui.*;

public class ContainerFactory implements FactoryInterface {

    public Container create () {
        ArrayList<NamedPanel> panels = new ArrayList<NamedPanel> ();

        panels.add (new ViewAdvertPanel (new String ("View Adverts")));
        panels.add (new UserAdvertsPanel (new String ("My Adverts")));

        return new Container (panels);
    }
}
