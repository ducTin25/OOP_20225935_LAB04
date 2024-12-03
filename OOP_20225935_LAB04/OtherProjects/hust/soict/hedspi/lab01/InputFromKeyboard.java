import java.util.Scanner;
public class InputFromKeyboard{
    public static void main(String agrs[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your name?");
        String strname = keyboard.nextLine();
        System.out.println("How old are you?");
        int iage = keyboard.nextInt();
        System.out.println("How tall are you?");
        double dheight = keyboard.nextDouble();

        System.out.println("Mr/ms. " + strname + "," + iage + " years old. " + "Your height is " + dheight + ".");
    }
}
