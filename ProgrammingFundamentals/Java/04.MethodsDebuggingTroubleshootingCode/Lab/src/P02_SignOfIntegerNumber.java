import java.util.Scanner;
public class P02_SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        printSign(n);
    }

    static void printSign(int number) {
        if(number > 0) {
            System.out.format("The number %d is positive.", number);
        } else if(number < 0) {
            System.out.format("The number %d is negative.", number);
        } else {
            System.out.format("The number %d is zero.", number);
        }
    }
}
