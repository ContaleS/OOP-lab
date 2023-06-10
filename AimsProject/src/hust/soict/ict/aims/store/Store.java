package hust.soict.ict.aims.store;
import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media media){
        itemsInStore.add(media);
        System.out.println("added");
    }

    public void removeMedia(Media media){
            if(itemsInStore.contains(media)){
                itemsInStore.remove(media);
                System.out.println("removed");
        }
    }
}
