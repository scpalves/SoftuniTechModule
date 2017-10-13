import java.util.Scanner;
public class P02_CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        System.out.format("%.12f", Math.PI * r * r);
    }
}
