package hust.soict.hedspi.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{    
    public static int nbDigitalVideoDisc = 0;
    private String title;
    private String category;
    private String director;
    // private int length;
    private float cost;
    // private int id;
    
    public DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost, director, length);
    }

    public  DigitalVideoDisc(int id, String title, String category, float cost){
        super(id,title,category,cost);
    }

    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());}

    // public DigitalVideoDisc(String title) {
    //     super();
    //     this.title = title;
    //     this.id = ++nbDigitalVideoDisc;
    // }
       

    
    // public DigitalVideoDisc(String title, String category, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDisc;
    // }


    // public DigitalVideoDisc(String title, String category, String director, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDisc;
    // }

    
    // public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.length = length;
    //     this.cost = cost;
    //     this.id = ++nbDigitalVideoDisc;
    // }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // public int getLength() {
    //     return length;
    // }

    // public void setLength(int length) {
    //     this.length = length;
    // }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

}
