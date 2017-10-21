import java.text.DecimalFormat;
import java.util.Scanner;
public class P07_MathPower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");
        double number = Double.parseDouble(console.nextLine());
        int power = Integer.parseInt(console.nextLine());
        System.out.println(df.format(Power(number, power)));
    }

    static double Power(double number, int power) {
        double result = 1;
        for(int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
