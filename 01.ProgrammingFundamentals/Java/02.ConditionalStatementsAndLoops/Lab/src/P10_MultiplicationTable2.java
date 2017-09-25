import java.util.Scanner;
public class P10_MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int multiplier = Integer.parseInt(console.nextLine());

        do {
            System.out.format("%d X %d = %d" + System.lineSeparator(),
                             number, multiplier, number * multiplier);
            multiplier++;
        } while(multiplier <= 10);
    }
}
