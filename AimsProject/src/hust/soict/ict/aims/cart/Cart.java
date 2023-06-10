package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.DigitalVideoDisc;
import hust.soict.ict.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int maxNumOrdered = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media){
        if(itemsOrdered.size() == maxNumOrdered){
            System.out.println("The cart is full");
        }
        else {
            itemsOrdered.add(media);
            System.out.println(media.toString()+ " is added");
        }
    }

    public void removeMedia(Media media){
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println(media.toString()+ " is removed");
        }
    }
    public float totalCost(){
        float totalCost = 0f;
        for(Media i : itemsOrdered){
            totalCost += i.getCost();
        }
        return totalCost;
    }

    public void sortCartByTitleCost() {
        this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortCartByCostTitle() {
        this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(Media i : itemsOrdered){
            System.out.println(i.getCost());
        }
        System.out.println("Total cost: "+ totalCost());
        System.out.println("***************************************************");
    }
    public String searchById(int id){
        for(Media i : itemsOrdered){
            if(i.getId() == id){
               return "";
            }
        }
        return "Id not found";
    }
    public String searchByTitle(String title){
        for(Media i : itemsOrdered){
            if(i.getTitle().equalsIgnoreCase(title)){
                return i.toString();
            }
        }
        return "title not found";
    }
}
