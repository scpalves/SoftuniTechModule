import java.util.Scanner;
public class P05_BooleanVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        boolean convertToBool = Boolean.valueOf(input);
        System.out.println(convertToBool ? "Yes" : "No");
    }
}
