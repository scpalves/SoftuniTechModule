import java.util.Scanner;
public class P12_NumberChecker {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        try {
            int number = Integer.parseInt(console.nextLine());
            System.out.println("It is a number.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input!");
        }
    }
}
