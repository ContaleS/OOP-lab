package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.disc.DigitalVideoDc;

public class Cart {
    private int qtyOrdered = 0;
    public static final int maxNumOrdered = 20;
    private DigitalVideoDc[] itemsOrdered = new DigitalVideoDc[maxNumOrdered];

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDc disc){
        if(qtyOrdered >= maxNumOrdered)
            System.out.println("the cart is full");
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added!");
        }
    }

    public void  addDigitalVideoDisc(DigitalVideoDc[] dvdList){
        if(qtyOrdered + dvdList.length <= maxNumOrdered) {
            for (int i = 0; i < dvdList.length && dvdList[i] != null; i++) {
                addDigitalVideoDisc(dvdList[i]);
            }
        }
        else
            System.out.println("number of order must less than 20");
    }
    public void  addDigitalVideoDisc(DigitalVideoDc[] dvdList, int size){
        if(qtyOrdered + size <= maxNumOrdered) {
            for (int i = 0; i < size; i++) {
                addDigitalVideoDisc(dvdList[i]);
            }
        }
        else
            System.out.println("number of order must less than 20");
    }

    public void  addDigitalVideoDisc(DigitalVideoDc dvd1, DigitalVideoDc dvd2){
        if(qtyOrdered <= 18) {
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }
        else
            System.out.println("number of order must less than 20");
    }
    public void removeDigitalVideoDisc(DigitalVideoDc disc){
        int i,j;
        if(qtyOrdered == 0)
            System.out.println("nothing to delete");
        else {
            for (i = 0, j = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] != disc) {
                    itemsOrdered[j] = itemsOrdered[i];
                    j++;
                }
            }
            if (qtyOrdered == j)
                System.out.println("Disc not found!");
            else {
                qtyOrdered = j;
                System.out.println("deleted!");
            }
        }
    }

    public float calculateCost(){
        float totalCost = 0f;
        for(int k = 0; k < qtyOrdered; k++){
            totalCost += itemsOrdered[k].getCost();
        }
        return totalCost;
    }
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered;i++){
            System.out.println(itemsOrdered[i]);
        }
        System.out.println("Total cost: "+ calculateCost());
        System.out.println("***************************************************");
    }
    public String searchById(int id){
        for(int i = 0; i < qtyOrdered;i++){
            if(itemsOrdered[i].getId() == id){
               return itemsOrdered[i].toString();
            }
        }
        return "Id not found";
    }
    public String searchByTitle(String title){
        for(int i = 0; i < qtyOrdered;i++){
            if(itemsOrdered[i].isMatch(title)){
                return itemsOrdered[i].toString();
            }
        }
        return "title not found";
    }
}
