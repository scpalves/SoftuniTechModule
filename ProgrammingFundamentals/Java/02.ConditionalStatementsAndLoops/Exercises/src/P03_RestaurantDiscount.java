import java.util.Scanner;
public class P03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int people = Integer.parseInt(console.nextLine());
        String desiredPackage = console.nextLine();
//----------------GROUPS--------------------------------------------
        boolean smallGroup = (people > 0) && (people <= 50);
        boolean mediumGroup = (people > 50) && (people <= 100);
        boolean largeGroup = (people > 100) && (people <= 120);
        boolean noSpace = (people > 120);
//----------------VALUES--------------------------------------------
        double packagePrice = 0;
        double pricePerPerson;
        String hall = "";
//-------------------------------------------------------------------------------------
        switch(desiredPackage) {
            case "Normal":
                packagePrice = 500.0;
                if(smallGroup) {
                    packagePrice += 2500.0; hall = "Small Hall";
                } else if(mediumGroup) {
                    packagePrice += 5000.0; hall = "Terrace";
                } else if(largeGroup) {
                    packagePrice += 7500.0; hall = "Great Hall";
                }
                packagePrice -= (packagePrice * 0.05);
                break;
//-------------------------------------------------------------------------------------
            case "Gold":
                packagePrice = 750.0;
                if(smallGroup) {
                    packagePrice += 2500.0; hall = "Small Hall";
                } else if(mediumGroup) {
                    packagePrice += 5000.0; hall = "Terrace";
                } else if(largeGroup) {
                    packagePrice += 7500.0; hall = "Great Hall";
                }
                packagePrice -= (packagePrice * 0.1);
                break;
//-------------------------------------------------------------------------------------
            case "Platinum":
                packagePrice = 1000.0;
                if(smallGroup) {
                    packagePrice += 2500.0; hall = "Small Hall";
                } else if(mediumGroup) {
                    packagePrice += 5000.0; hall = "Terrace";
                } else if(largeGroup) {
                    packagePrice += 7500.0; hall = "Great Hall";
                }
                packagePrice -= (packagePrice * 0.15);
                break;
        }
        pricePerPerson = packagePrice / people;
        System.out.format((noSpace) ? "We do not have an appropriate hall." :
                                      "We can offer you the %s" + System.lineSeparator() +
                                      "The price per person is %.2f$",
                                                                    hall, pricePerPerson );
    }
}
