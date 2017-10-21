import java.text.DecimalFormat;
import java.util.Scanner;
public class P06_CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");
        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        System.out.println(df.format(getTriangleArea(width, height)));
    }

    static double getTriangleArea(double width, double height) {
        double result = width * height / 2;
        return  result;
    }
}
