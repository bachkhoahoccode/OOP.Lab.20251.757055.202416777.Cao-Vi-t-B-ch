package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc extends Media {
   
    private String director;
    private int id;

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
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
    public int getId() {
        return this.id;
    }
    public String toString() {
        return "DVD - [" + title + "] - [" + category + "] - [" + director + "] - [" + length + ": [" + cost + "] $";
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
    
}
