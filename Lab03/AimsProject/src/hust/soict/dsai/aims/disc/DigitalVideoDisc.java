package hust.soict.dsai.aims.disc;
import hust.soict.dsai.aims.media.Media;
public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        setTitle(title);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title,category,director,cost);
        this.length = length;
    }
    
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String toString() {
        return "DVD - [" + getTitle() + "] - [" + getCategory() + "] - [" + director + "] - [" + length + ": [" + getCost() + "] $";
    }
    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title);
    }    
}
