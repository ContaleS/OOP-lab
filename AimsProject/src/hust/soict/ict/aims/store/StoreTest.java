package hust.soict.ict.aims.store;

import hust.soict.ict.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args){
        Store myStore = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        myStore.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        myStore.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        myStore.addMedia(dvd3);
        myStore.removeMedia(dvd1);
        myStore.removeMedia(dvd2);
    }
}
