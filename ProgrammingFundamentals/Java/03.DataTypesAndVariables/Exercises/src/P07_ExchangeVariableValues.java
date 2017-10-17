import java.util.Scanner;
public class P07_ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c;

        System.out.format("Before:%n" + "a = %d%n" + "b = %d%n", a, b);
        c = a; a = b;
        System.out.format("After:%n" + "a = %d%n" + "b = %d%n", a, c);
    }
}
