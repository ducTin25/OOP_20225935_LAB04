package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;
public class book extends Media {
    // private int id;
    // private String title;
    // private String category;
    // private float cost;
    private List<String> authors = new ArrayList<String>();
    public book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }
    public book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public List<String> getAuthors() {
        return authors; 
        }
    public void setAuthors(List<String> authors) { 
        this.authors = authors; 
    }
    public void addAuthor(String authorName) {
        if(authors.contains(authorName)) {
            System.out.println(authorName + "not added to list yet!");
        } else {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println(authorName + "not added to list yet!");
        }
    }
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("Book: " +
                " [id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", category='" + getCategory() + '\'' +
                ", authors: ");
        for(String a : authors) {
            print.append(a);
            print.append(" ");
        }
        print.append(", cost: ");
        print.append(getCost());
        print.append("$]");
        return print.toString();
    }
}