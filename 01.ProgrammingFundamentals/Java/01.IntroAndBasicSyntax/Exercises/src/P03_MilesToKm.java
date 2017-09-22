import java.util.Scanner;
public class P03_MilesToKm {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double miles = Double.parseDouble(console.nextLine());
        System.out.format("%.2f",miles * 1.60934);
    }
}
