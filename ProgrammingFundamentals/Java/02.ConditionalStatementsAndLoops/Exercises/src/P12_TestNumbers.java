import java.util.Scanner;
public class P12_TestNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        int limit = Integer.parseInt(console.nextLine());
        int sum = 0, count = 0;

        for(; n >= 1; n--) {
            for(int i = 1; m >= i; i++) {
                count++;
                sum += (n*i)*3;
                if(sum >= limit) {
                    System.out.format("%d combinations %n", count);
                    System.out.format("Sum: %d >= %d %n", sum, limit);
                    return;
                }
            }
        }
        System.out.format("%d combinations %n", count);
        System.out.format("Sum: %d %n", sum);
    }
}
