import java.util.Scanner;
public class P01_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        byte centuries = Byte.parseByte(console.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = 24 * days;
        int minutes = 60 * hours;

        System.out.format("%d centuries = %d years = %d days = %d hours = %d minutes",
                          centuries, years, days, hours, minutes);
    }
}
