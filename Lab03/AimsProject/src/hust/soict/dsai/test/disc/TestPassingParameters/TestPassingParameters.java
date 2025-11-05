package hust.soict.dsai.test.disc.TestPassingParameters;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class TestPassingParameters {
    public static void main(String[] args) {
        DigitalVideoDisc jungledvd = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderelladvd = new DigitalVideoDisc("Cinderella");
//original swap that doesn't work           
        swapDVDs(jungledvd, cinderelladvd);
        System.out.println("Jungle DVD title: " + jungledvd.getTitle());
        System.out.println("Cinderella DVD title: " + cinderelladvd.getTitle());
        changeTitle(jungledvd, cinderelladvd.getTitle());
        System.out.println("Jungle DVD title: " + jungledvd.getTitle());
//swaps that works for real
        DigitalVideoDisc[] dvdArray = new DigitalVideoDisc[2];
        dvdArray[0] = jungledvd;
        dvdArray[1] = cinderelladvd;        
        swap_that_works_1(dvdArray);
        System.out.println("After swap_that_works_1:");
        System.out.println("DVD 1 title: " + dvdArray[0].getTitle());
        System.out.println("DVD 2 title: " + dvdArray[1].getTitle());
        swap_that_works_2(dvdArray[0], dvdArray[1]);
        System.out.println("After swap_that_works_2:"); 
        System.out.println("DVD 1 title: " + dvdArray[0].getTitle());
        System.out.println("DVD 2 title: " + dvdArray[1].getTitle());
    }
    public static void swapDVDs(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        DigitalVideoDisc temp = dvd1;
        dvd1 = dvd2;
        dvd2 = temp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        // String oldTitle = dvd.getTitle(); (also redundant as a result)
        dvd.setTitle(title);
        //dvd = new DigitalVideoDisc(oldTitle); (this is actually redundant tho??)
    }
    public static void swap_that_works_1(DigitalVideoDisc[] dvdArray) {
        DigitalVideoDisc temp = dvdArray[0];
        dvdArray[0] = dvdArray[1];
        dvdArray[1] = temp;
    }
    public static void swap_that_works_2(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tempTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tempTitle);
    }
}
