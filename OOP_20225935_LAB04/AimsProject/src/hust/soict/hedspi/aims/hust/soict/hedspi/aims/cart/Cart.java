package hust.soict.hedspi.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.hedspi.aims.media.Media;
public class Cart  
{
    public static final int MAX_NUMBERS_ORDERED = 20;   
    // private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    // private int qtyOrdered;   
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + "is already in the cart !");
        } else {
            itemsOrdered.add(item);
            System.out.println(item.getTitle() + " is now in your cart !");
        }
    }
    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        } else {
            System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart !");
        }
    }

    // public int addDigitalVideoDisc(DigitalVideoDisc disc) 
    // {
    //     if (qtyOrdered == MAX_NUMBERS_ORDERED) {
    //     System.out.println("The cart is almost full. Can't add more díc");
    //     return 0;
    //     } else 
    //     {
    //     itemsOrdered[qtyOrdered] = disc;
    //     qtyOrdered ++;
    //     System.out.println("The disc has been added");
    //     return 1;
    //     }
    // }
    /*public int addDigitalVideoDisc(DigitalVideoDisc[] discList) 
    {
        int added = 0;
        for (DigitalVideoDisc disc : dvdList){
            if (qtyOrdered == MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almost full");
                break;
            }
            else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added");
                added++;
            }
        }
        return added;
    }*/
    // public int addDigitalVideoDisc(DigitalVideoDisc... dvdArray) 
    // {
    //     int addCount = 0;
    //     for (DigitalVideoDisc disc : dvdArray) 
    //     {
    //         if (qtyOrdered == MAX_NUMBERS_ORDERED) 
    //         {
    //         System.out.println("The cart is almost full.");
    //         break;
    //         } else 
    //         {
    //         itemsOrdered[qtyOrdered] = disc;
    //         qtyOrdered++;
    //         System.out.println("The disc has been added");
    //         addCount++;
    //         }
    //     }
    //     return addCount;
    // }
    // public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) 
    // {
    //     if (qtyOrdered + 1 >= MAX_NUMBERS_ORDERED) 
    //     {
    //     System.out.println("The cart is almost full. Can't add more discs");
    //     return 0;
    //     } else 
    //     {
    //     itemsOrdered[qtyOrdered] = dvd1;
    //     qtyOrdered++;
    //     System.out.println("The DVD " + '\"' + dvd1.getTitle() + '\"' + " has been added!");
    //     itemsOrdered[qtyOrdered] = dvd2;
    //     qtyOrdered++;
    //     System.out.println("The DVD " + '\"' + dvd2.getTitle() + '\"' + " has been added!");
    //     return 2; 
    //     }
    // }


    // public int removeDigitalVideoDisc(DigitalVideoDisc disc) 
    // {
    //     if(itemsOrdered[0] ==  null) {
    //     System.out.println("Your cart is empty!");
    //     return 0;
    //     }
    //     for(int i = 0; i < qtyOrdered;i++) 
    //     {
    //         if(itemsOrdered[i].equals(disc)) {
    //             for(int j = i;i<qtyOrdered-1;i++) {
    //             itemsOrdered[i] = itemsOrdered[i+1];
    //             }
    //             itemsOrdered[qtyOrdered-1] = null;
    //             qtyOrdered--;
    //             System.out.println("Remove DVD successfully!");
    //             return 1;
    //         }
    //     }
    //     System.out.println("No DVD match!");
    //     return 0;
    // }
    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }
    /*public void print() 
    {
        StringBuilder output = new StringBuilder("\n");
        for (int i = 0; i < qtyOrdered; i++)
        {
            output
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        System.out.println(output);
    }
}*/
    public void print() {
        System.out.println("");
        System.out.println("Ordered items:");
        int i = 1;
        for (Media item : itemsOrdered) {
            System.out.printf("%d.[%s] - [%s] - [%s] - [%d]: %.2f $\n", 
            i+1, 
            item.getTitle(), 
            item.getCategory(),  
            item.getCost()
        );
    }
    System.out.printf("Total cost: %.2f $\n", totalCost());
    System.out.println("");
}
public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }
    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }
    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }
    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }
}