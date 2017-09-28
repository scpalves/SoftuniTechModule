import java.util.Scanner;
public class P08_SumOfOddNums {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = 0;

        for(int i = 1, odd = 1; i <= number ; i++) {
            System.out.println(odd);
            sum += odd;
            odd += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
