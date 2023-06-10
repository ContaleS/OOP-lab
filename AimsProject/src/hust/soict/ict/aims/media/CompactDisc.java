package hust.soict.ict.aims.media;

import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        }
    }
    public float getLength(){
        float sum = 0;
        for(Track t : tracks){
            sum += t.getLength();
        }
        return sum;
    }
    @Override
    public void play(){
        for (Track t : tracks)
            t.play();
    }
}
