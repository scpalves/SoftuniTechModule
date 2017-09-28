import java.util.Scanner;
public class P02_ChooseDrink2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String profession = console.nextLine();
        int quantity = Integer.parseInt(console.nextLine());
        double price = -1.0;
        switch(profession) {
            case "Athlete":
                price = quantity * 0.70;
                System.out.format("The %s has to pay %.2f.", profession ,price);
                break;
            case "Businessman":
            case "Businesswoman":
                price = quantity * 1.00;
                System.out.format("The %s has to pay %.2f.", profession ,price);
                break;
            case "SoftUni Student":
                price = quantity * 1.70;
                System.out.format("The %s has to pay %.2f.", profession ,price);
                break;
            default:
                price = quantity * 1.20;
                System.out.format("The %s has to pay %.2f.", profession ,price);
                break;
        }
    }
}
