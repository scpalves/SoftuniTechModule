import java.util.Locale;
import java.util.Scanner;
public class P06_TheatrePromotions {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String type = console.nextLine().toLowerCase(Locale.ROOT);
        int age = Integer.parseInt(console.nextLine());
        boolean age1 = (age >= 0) && (age <= 18);
        boolean age2 = (age > 18) && (age <= 64);
        boolean age3 = (age > 64) && (age <= 122);

        switch (type) {
            case "weekday":
                if(age1) {
                    System.out.println("12$");
                } else if(age2) {
                    System.out.println("18$");
                } else if(age3) {
                    System.out.println("12$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "weekend":
                if(age1) {
                    System.out.println("15$");
                } else if(age2) {
                    System.out.println("20$");
                } else if(age3) {
                    System.out.println("15$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "holiday":
                if(age1) {
                    System.out.println("5$");
                } else if(age2) {
                    System.out.println("12$");
                } else if(age3) {
                    System.out.println("10$");
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}
