package hust.soict.ict.aims.media;

public class Track implements Playable {
    private int length;
    private String title;

    public Track(int length, String title) {
        this.length = length;
        this.title = title;
    }

    public Track() {
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if(!(o instanceof Track)){
            return false;
        }
        Track other = (Track) o;
        return title.equals(other.title) && length == other.length;
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
