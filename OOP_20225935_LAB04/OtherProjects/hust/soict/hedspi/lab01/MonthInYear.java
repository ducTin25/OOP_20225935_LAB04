import java.util.Scanner;

public class MonthInYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(String month, int year) {
        month = month.toLowerCase();

        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 30;
            case "may":
            case "5":
                return 31;
            case "june":
            case "jun.":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul.":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sep.":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;

        while (true) {
            System.out.print("Enter the month (name, abbreviation, or number): ");
            month = scanner.nextLine();
            
            System.out.print("Enter the year (non-negative integer): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid year input. Please enter a valid year.");
                scanner.next(); 
                continue;
            }

            year = scanner.nextInt();
            scanner.nextLine(); 

            if (year < 0) {
                System.out.println("Year cannot be negative. Please enter again.");
                continue;
            }

            int days = getDaysInMonth(month, year);
            if (days == -1) {
                System.out.println("Invalid month input. Please try again.");
            } else {
                System.out.println("Number of days in " + month + " " + year + ": " + days);
                break;
            }
        }

        scanner.close();
    }
}
