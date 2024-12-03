import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hight, k = 0;
    System.out.printf("\n\nEnter hight: ");
    hight = sc.nextInt();
    for (int i = 1; i <= hight; ++i, k = 0) {
      for (int space = 1; space <= hight - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
   }
}