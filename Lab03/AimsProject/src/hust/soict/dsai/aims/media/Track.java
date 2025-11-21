package hust.soict.dsai.aims.media;

public class Track {
    String title;
    int length;
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
}
