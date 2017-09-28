import java.util.Scanner;
public class P07_CakeIngredients {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        for(int i = 0; i <= 20; i++) {
            String ingredient = console.nextLine();
            if (ingredient.equals("Bake!")) {
                System.out.format("Preparing cake with %d ingredients.", i);
                break;
            }
            System.out.format("Adding ingredient %s." + System.lineSeparator(), ingredient);
        }
    }
}