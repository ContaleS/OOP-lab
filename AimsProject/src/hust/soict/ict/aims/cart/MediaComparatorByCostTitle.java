package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    public int compare(Media m1, Media m2) {
        if(Float.compare(m1.getCost(), m2.getCost()) == 0){
            return m1.getTitle().compareTo(m2.getTitle());
        }else{
            return Float.compare(m1.getCost(), m2.getCost());
        }
    }
}
