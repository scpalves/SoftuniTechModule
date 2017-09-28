import java.util.Scanner;
public class P08_CaloriesCounter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        int calories = 0;
        for(int i = 1; i <= n; i++) {
            String ingredient = console.nextLine().toLowerCase();
            switch(ingredient) {
                case "cheese":
                    calories += 500;
                    break;
                case "tomato sauce":
                    calories += 150;
                    break;
                case "salami":
                    calories += 600;
                    break;
                case "pepper":
                    calories += 50;
                    break;
                default:
                    break;
            }
        }
        System.out.format("Total calories: %d", calories);
    }
}
