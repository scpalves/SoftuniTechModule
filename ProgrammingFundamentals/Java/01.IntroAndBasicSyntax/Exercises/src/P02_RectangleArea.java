import java.util.Scanner;
public class P02_RectangleArea {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        System.out.format("%.2f",a * b);
    }
}
