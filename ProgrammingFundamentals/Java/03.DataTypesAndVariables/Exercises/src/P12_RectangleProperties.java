import java.text.DecimalFormat;
import java.util.Scanner;
public class P12_RectangleProperties {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        DecimalFormat df = new DecimalFormat("#.#############");

        // Calculating - perimeter - area - diagonal
        System.out.println(df.format(((2 * width) + (2 * height))) + System.lineSeparator() +
                df.format((width * height)) + System.lineSeparator() +
                df.format(Math.sqrt((width * width) + (height * height))));
    }
}
