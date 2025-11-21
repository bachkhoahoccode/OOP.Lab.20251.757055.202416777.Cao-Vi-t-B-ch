package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Disc() {
        // TODO Auto-generated constructor stub 
    }
     public Disc(String title) {
        setTitle(title);
    }
    public Disc(String title, String category, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }
    public Disc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }
    public Disc(String title, String category, String director, int length, float cost) {
        this(title,category,director,cost);
        this.length = length;
    }
}
