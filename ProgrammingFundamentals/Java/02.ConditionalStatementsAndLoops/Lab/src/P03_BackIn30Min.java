import java.util.Scanner;
public class P03_BackIn30Min {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine()) + 30;

        if(minutes >= 60) {
            hours++;
            minutes -= 60;
        }
        if(hours >= 24) {
            hours -= 24;
        }
        System.out.format("%d:%02d", hours, minutes);
    }
}
