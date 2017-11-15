package JoeFox.Models;

import javax.swing.DefaultListModel;

public class AdvertListModel<T> extends DefaultListModel<T> {

    public void update (int index) {
        //https://stackoverflow.com/a/24840961
        this.fireContentsChanged (this, index, index);
    }
}
