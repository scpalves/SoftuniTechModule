import java.util.Scanner;
public class P15_FastPrimeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        for(int i = 2; i <= num; i++)
        {
            boolean isPrime = true;
            for(int divider = 2; divider <= Math.sqrt(i); divider++)
            {
                if(i % divider == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            System.out.format("%d -> %s%n", i, isPrime ? "True" : "False");
        }
    }
}
