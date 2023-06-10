package hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;

    private String director;
    private int length;

    public DigitalVideoDisc(){
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title){
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, float cost){
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost){
        this.director = director;
        nbDigitalVideoDiscs++;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.director = director;
        this.length = length;
        nbDigitalVideoDiscs++;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    @Override
    public String toString() {
        return id +". DVD " + title + " - " + category + " - "
                + director + " - " + length + ": "+ cost + " $";
    }
    public boolean isMatch(String title){
        if(getTitle() == title)
            return true;
        else
            return false;
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
