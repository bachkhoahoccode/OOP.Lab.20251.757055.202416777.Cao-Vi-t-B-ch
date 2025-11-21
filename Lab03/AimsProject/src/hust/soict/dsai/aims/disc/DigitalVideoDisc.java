package hust.soict.dsai.aims.disc;
import hust.soict.dsai.aims.media.Disc;
public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    
    public String toString() {
        return "DVD - [" + getTitle() + "] - [" + getCategory() + "] - [" + director + "] - [" + length + ": [" + getCost() + "] $";
    }
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }    
}
