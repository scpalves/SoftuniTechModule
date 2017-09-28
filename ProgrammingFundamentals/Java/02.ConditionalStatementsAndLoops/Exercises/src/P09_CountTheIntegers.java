import java.util.Scanner;
public class P09_CountTheIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 0;
        try {
            for(i = 0; i <= 100; i++) {
                int count = Integer.parseInt(console.nextLine());
            }
        } catch(NumberFormatException hex) {
            System.out.print(i);
        }
    }
}
