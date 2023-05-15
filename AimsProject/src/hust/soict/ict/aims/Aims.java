package hust.soict.ict.aims;
import hust.soict.ict.aims.disc.DigitalVideoDc;
import hust.soict.ict.aims.cart.Cart;
public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDc[] dvdList = new DigitalVideoDc[Cart.maxNumOrdered];
        dvdList[0] = new DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        dvdList[1] = new DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        dvdList[2] = new DigitalVideoDc("Aladin", "Animation", 18.99f);
/*        hust.soict.ict.aims.disc.DigitalVideoDc dvd1 = new hust.soict.ict.aims.disc.DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        hust.soict.ict.aims.disc.DigitalVideoDc dvd2 = new hust.soict.ict.aims.disc.DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        hust.soict.ict.aims.disc.DigitalVideoDc dvd3 = new hust.soict.ict.aims.disc.DigitalVideoDc("Aladin", "Animation", 18.99f);
       anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd2);
       anOrder.addDigitalVideoDisc(dvd1); */
        anOrder.addDigitalVideoDisc(dvdList);
        anOrder.addDigitalVideoDisc(dvdList,3);
        anOrder.addDigitalVideoDisc(dvdList[0],dvdList[1]);
//        anOrder.listOfOrderedItems(anOrder.getQtyOrdered());
//        System.out.println(hust.soict.ict.aims.disc.DigitalVideoDc.getNbDigitalVideoDiscs());
        System.out.println(anOrder.searchById(2));
        System.out.println(anOrder.searchByTitle("The ion King"));
    }
}
