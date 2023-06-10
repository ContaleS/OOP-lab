package hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        this.authors = authors;
    }

    public Book(List<String> authors) {
        this.authors = authors;
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
}
