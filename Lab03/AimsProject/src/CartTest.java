public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "The Wachowskis", 136, 12.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 15.99f);
        cart.printCart()
}
