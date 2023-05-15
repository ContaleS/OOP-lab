package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DigitalVideoDc;

import java.util.ArrayList;
public class Store {
    private ArrayList<DigitalVideoDc> itemsInStore = new ArrayList<>();
    public void addDVD(DigitalVideoDc dvd){
        itemsInStore.add(dvd);
        System.out.println("added");
    }

    public void removeDVD(DigitalVideoDc dvd){
        for(DigitalVideoDc i : itemsInStore){
            if(i.isMatch(dvd.getTitle())){
                this.itemsInStore.remove(i);
                System.out.println("removed");
                break;
            }
        }
    }
}
