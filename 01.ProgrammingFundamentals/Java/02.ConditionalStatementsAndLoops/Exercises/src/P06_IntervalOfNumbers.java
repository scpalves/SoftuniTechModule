import java.util.Scanner;
public class P06_IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());

        if(start < end) {
            for(int i = start; i <= end; i++) {
                System.out.println(i);
            }
        } else {
            for(int i = end; i <= start; i++) {
                System.out.println(i);
            }
        }
    }
}
