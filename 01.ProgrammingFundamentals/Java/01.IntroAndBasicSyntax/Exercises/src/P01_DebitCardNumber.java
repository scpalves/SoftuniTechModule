import java.util.Scanner;
public class P01_DebitCardNumber {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        int d = Integer.parseInt(console.nextLine());

        System.out.format("%04d %04d %04d %04d",a, b, c, d);
    }
}
