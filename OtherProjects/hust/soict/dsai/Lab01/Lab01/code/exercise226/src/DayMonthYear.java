import java.util.Scanner;
public class DayMonthYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year = -1;
        while (true) {
            System.out.print("Enter month: ");
            String monthInput = scanner.nextLine().trim();
            month = parseMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }
            System.out.print("Enter year (AD, in full): ");
            String yearInput = scanner.nextLine().trim();
            if (!yearInput.matches("\\d+")) {
                System.out.println("Invalid year. Please try again.");
                continue;
            }
            year = Integer.parseInt(yearInput);
            if (year < 0) {
                System.out.println("Invalid year. Please try again.");
                continue;
            }
            break;
        }
        int days = getDaysInMonth(month, year);
        System.out.println("The month you type has" + days +"days");
        scanner.close();
    }

    private static int parseMonth(String input) {
        
    switch(input){
        case"january": case"jan." :case "jan" :case "1":return 1;
        case"february": case"feb." :case "feb" :case "2":return 2;
        case"march": case"mar." :case "mar" :case "3":return 3;
        case"april": case"apr." :case "apr" :case "4": return 4;
        case"may": case"may." :case "5":return 5;
        case"june": case"jun." :case "jun" :case "6":  return 6;
        case"july": case"jul." :case "jul" :case "7": return 7;
        case"august": case"aug" :case"aug.": case "8": return 8;
        case"september": case"sep." :case "sep" :case "9": return 9;
        case"october": case"oct." :case "oct" :case "10": return 10;
        case"november": case"nov." :case "nov" :case "11":return 11;
        case"december": case"dec." :case "dec" :case "12":return 12;
        default: return -1;
        }
    }
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    
    
}
