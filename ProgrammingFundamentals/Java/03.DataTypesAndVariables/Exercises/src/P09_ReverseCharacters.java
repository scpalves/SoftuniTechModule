import java.util.Scanner;
public class P09_ReverseCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char first = console.nextLine().charAt(0);
        char second = console.nextLine().charAt(0);
        char third = console.nextLine().charAt(0);

        System.out.println("" + third + second + first);
    }
}
