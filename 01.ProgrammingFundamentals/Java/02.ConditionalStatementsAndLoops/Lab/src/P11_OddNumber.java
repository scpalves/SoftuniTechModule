import java.util.Scanner;
public class P11_OddNumber {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        for(int i = 1; i <= 10; i++) {
            int number = Integer.parseInt(console.nextLine());
            if(number % 2 == 0) {
                System.out.println("Please write an odd number.");
            } else {
                System.out.println("The number is: " + Math.abs(number));
                break;
            }
        }
    }
}
