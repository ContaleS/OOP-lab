
public class Cart {
    private int qtyOrdered = 0;
    public static final int maxNumOrdered = 20;
    private DigitalVideoDc[] itemsOrdered = new DigitalVideoDc[maxNumOrdered];

    public void addDigitalVideoDisc(DigitalVideoDc disc){
        if(qtyOrdered >= maxNumOrdered)
            System.out.println("the cart is full");
        else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added!");
        }
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
}
