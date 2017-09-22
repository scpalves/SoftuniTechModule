import java.text.DecimalFormat;
import java.util.Scanner;
public class P04_BeverageLabels {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int volume = Integer.parseInt(console.nextLine());
        int energy = Integer.parseInt(console.nextLine());
        int sugar = Integer.parseInt(console.nextLine());
        double kcal = volume*(energy/100.0);
        double g = volume*(sugar/100.0);

        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.format("%sml %s:%n",formatter.format(volume), name);
        System.out.format("%skcal, %sg sugars", formatter.format(kcal), formatter.format(g));
    }
}
