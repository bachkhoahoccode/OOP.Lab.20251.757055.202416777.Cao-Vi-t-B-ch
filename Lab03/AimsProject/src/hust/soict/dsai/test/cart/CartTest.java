package hust.soict.dsai.test.cart;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class CartTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "The Wachowskis", 136, 12.99f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 15.99f);
        cart.addDigitalVideoDisc(dvd3);
        cart.printCart();
        cart.searchById(3);
        String input = scanner.nextLine();
        scanner.close();
        cart.searchByTitle(input);
    }
}
