import java.util.Scanner;
public class pyramid6_3 {
    public static void main(String[] args) {
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        height = scanner.nextInt();
        scanner.close();

        
        for (int i = 1; i <= height; i++) {
            // Print leading spaces
            String spaces = " ".repeat(height - i); // Java 11 and above
            String stars = "*".repeat(2 * i - 1); // Java 11 and above
            System.out.println(spaces + stars);
        }
    }
}
