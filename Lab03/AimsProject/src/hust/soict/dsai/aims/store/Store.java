package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int qtyItemsInStore;

    public void addDVD(DigitalVideoDisc disc) {
        // Implementation to add DVD to store
        for (int i = 0; i < qtyItemsInStore; i++) {
            if (itemsInStore[i] == null) {
                itemsInStore[i] = disc;
                qtyItemsInStore++;
                System.out.println("The disc has been added to the store");
                return;
            }
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        // Implementation to remove DVD from store
        for (int i = 0; i < qtyItemsInStore; i++) {
            if (itemsInStore[i].getTitle().equals(disc.getTitle())) {
                itemsInStore[i] = null;
                qtyItemsInStore--;
                System.out.println("The disc has been removed from the store");
                return;
            }
        }
    }   
}
