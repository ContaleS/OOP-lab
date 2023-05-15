package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.disc.DigitalVideoDc;

public class cartTest {
    public static void main(String[] args){
        Cart cart = new Cart();
        DigitalVideoDc dvd1 = new DigitalVideoDc("The Lion King",
                "Animation", " Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDc dvd2 = new DigitalVideoDc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDc dvd3 = new DigitalVideoDc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        cart.print();
        System.out.println(cart.searchById(2));
        System.out.println(cart.searchById(5));
        System.out.println(cart.searchByTitle("The ion King"));
        System.out.println(cart.searchByTitle("The Lion King"));
    }
}
