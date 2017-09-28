import java.util.Scanner;
public class P01_Greeting {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.format("Hello, %s!", name);
    }
}
