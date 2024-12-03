import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    String strNum1 = scanner.next();
    double num1 = Double.parseDouble(strNum1);
    System.out.print("Enter the second number: ");
    String strNum2 = scanner.next();
    double num2 = Double.parseDouble(strNum2);
    double sum = num1 + num2;
    double diff = num1 - num2;
    double product = num1 * num2;
    double quotient = 0;
    if (num2 != 0) {
      quotient = num1 / num2;
    }
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + diff);
    System.out.println("Product: " + product);
    System.out.println("Quotient: " + quotient);
  }
}