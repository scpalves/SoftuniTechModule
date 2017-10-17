import java.math.BigDecimal;
import java.util.Scanner;
public class P03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for(int i = 1; i <= n; i++) {
            BigDecimal num = new BigDecimal(console.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
