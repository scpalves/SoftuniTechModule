import java.util.Scanner;
public class P04_DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        headerOrFooter(n);
        for(int i = 0; i < n-2; i++) {
            middlePart(n);
        }
        headerOrFooter(n);
    }

    static void headerOrFooter(int number) {
        for(int i = 1; i <= number*2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void middlePart(int number) {
        System.out.print("-");
            for(int i = 0; i <= number-2; i++) {
                    System.out.print("\\/");
            }
        System.out.println("-");
    }
}
