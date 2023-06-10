package hust.soict.ict.aims.cart;

import hust.soict.ict.aims.media.*;

public class cartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd = new DigitalVideoDisc("b", "Fiction", "Bach", 0, 10);
        Book book = new Book("c", "Fiction", 50);
        CompactDisc cd = new CompactDisc("a", "pop", "Bach", 0, 20, "Back");
        cart.addMedia(cd);
        cart.addMedia(book);
        cart.addMedia(dvd);
        System.out.println(cart.toString());
        cart.sortCartByTitleCost();
        System.out.println(cart.toString());
        cart.sortCartByCostTitle();
        System.out.println(cart.toString());
    }
}
