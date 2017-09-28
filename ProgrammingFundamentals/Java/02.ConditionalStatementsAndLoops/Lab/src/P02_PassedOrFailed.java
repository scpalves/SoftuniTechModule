import java.util.Scanner;
public class P02_PassedOrFailed {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        System.out.println((grade >= 3.0) ? "Passed!":"Failed!");
    }
}
