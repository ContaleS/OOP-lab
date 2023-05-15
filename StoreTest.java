package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DigitalVideoDc;
import hust.soict.ict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        Store myStore = new Store();
        DigitalVideoDc dvd1 = new DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        myStore.addDVD(dvd1);
        DigitalVideoDc dvd2 = new DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        myStore.addDVD(dvd2);
        DigitalVideoDc dvd3 = new DigitalVideoDc("Aladin", "Animation", 18.99f);
        myStore.addDVD(dvd3);
        myStore.removeDVD(dvd1);
        myStore.removeDVD(dvd2);
    }
}
