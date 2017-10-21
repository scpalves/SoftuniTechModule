import java.util.Scanner;
public class P05_TemperatureConversion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(console.nextLine());
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.format("%.2f", celsius);
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * 5 / 9;
        return result;
    }
}
