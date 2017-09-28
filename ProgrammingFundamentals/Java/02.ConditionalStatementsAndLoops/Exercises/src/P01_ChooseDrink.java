import java.util.Scanner;
public class P01_ChooseDrink {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String profession = console.nextLine().toLowerCase();

        switch(profession) {
            case "athlete":
                System.out.println("Water");
                break;
            case "businessman":
            case "businesswoman":
                System.out.println("Coffee");
                break;
            case "softuni student":
                System.out.println("Beer");
                break;
            default:
                System.out.println("Tea");
                break;
        }
    }
}
