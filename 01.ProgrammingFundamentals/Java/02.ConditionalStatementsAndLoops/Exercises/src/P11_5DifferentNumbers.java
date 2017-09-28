import java.util.Scanner;
public class P11_5DifferentNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        for(int i = a; i <= b; i++) {
            for(int j = a; j < b; j++) {
                for(int k = a; k < j; k++) {
                    System.out.print(k);
                }
               System.out.print(i);
            }
            System.out.println();
        }
//todo fix

    }
}
