
import java.util.ArrayList;
import java.util.List;

import hust.soict.hedspi.aims.media.*;
public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,"Star Wars", "fantasy",4.5f,"BPL",90);
        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Too Cool too die",3));
        tracks.add(new Track("Dope",4));
        CompactDisc cd = new CompactDisc(2,"Magic in the air", "Rap" , 3.5f,"Post Malone",tracks);
        List<String> authors = new ArrayList<String>();
        authors.add("danrangto");
        authors.add("tranlaluot");
        book book = new book(3,"Toi thay hoa vang tren co xanh","novel",5.2f,authors);

        mediae.add(dvd);
        mediae.add(cd);
        mediae.add(book);

        for(Media m: mediae) {
            System.out.println(m.toString());
        }
    }
}
