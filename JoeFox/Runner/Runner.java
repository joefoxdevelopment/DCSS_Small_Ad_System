package JoeFox.Runner;

import JoeFox.Gui.*;

public class Runner {

    public static void main (String args[]) {
        System.out.println ("Starting");
        ContainerFactory factory = new ContainerFactory ();
        Container container      = factory.create();
    }

}
