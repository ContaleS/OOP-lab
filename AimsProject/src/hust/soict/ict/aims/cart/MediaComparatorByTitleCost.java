package hust.soict.ict.aims.cart;
import hust.soict.ict.aims.media.Media;

import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        if(m1.getTitle().compareTo(m2.getTitle()) == 0){
            return Float.compare(m1.getCost(), m2.getCost());
        }else{
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }
}
