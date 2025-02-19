package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		cart cart = new cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.5f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addDigitalVideoDisc(dvd3);
		cart.printListItems();
		//cart.searchForDVDByID();
        cart.searchForDVDByTitle();
        System.exit(0);
	}
}
