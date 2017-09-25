import java.util.Scanner;
public class P09_MultiplicationTable {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        for(int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d" + System.lineSeparator(), number, i, number * i);
        }
    }
}
