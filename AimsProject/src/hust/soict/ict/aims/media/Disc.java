package hust.soict.ict.aims.media;

public class Disc extends Media{
    public Disc(float length, String director) {
        super();
        this.length = length;
        this.director = director;
    }

    public Disc() {
    }

    private float length;
    private String director;

    public Disc(String title, String category, String director,float length, float cost ) {
        super( title, category, cost);
        this.length = length;
        this.director = director;
    }

    public float getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
