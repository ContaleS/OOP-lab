package hust.soict.ict.aims.media;
import hust.soict.ict.aims.cart.*;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Media)) {
            return false;
        }

        Media other = (Media) o;

        return id == other.id && title.equals(other.title) &&
                category.equals(other.category) && cost == other.cost;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public Media() {
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    public String toString() {
        return id +". DVD " + title + " - " + category + " - "
                + cost + " $";
    }
}
