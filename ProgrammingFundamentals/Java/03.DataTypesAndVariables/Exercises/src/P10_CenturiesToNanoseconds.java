import java.math.BigDecimal;
import java.util.Scanner;
public class P10_CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int centuries = Integer.parseInt(console.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        long hours = (long)(days * 24);
        long minutes = hours * 60L;

        BigDecimal thousands = new BigDecimal(1000);
        BigDecimal seconds = new BigDecimal(minutes*60);
        BigDecimal milliseconds = seconds.multiply(thousands);
        BigDecimal microseconds = milliseconds.multiply(thousands);
        BigDecimal nanoseconds = microseconds.multiply(thousands);

        System.out.format("%d centuries = %d years = %d days = %d hours = %d minutes = " +
                          "%s seconds = %s milliseconds = %s microseconds = %s nanoseconds",
                centuries, years, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds);
    }
}
