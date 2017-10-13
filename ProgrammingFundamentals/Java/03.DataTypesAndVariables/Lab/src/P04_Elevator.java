import java.util.Scanner;
public class P04_Elevator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int people = Integer.parseInt(console.nextLine());
        int capacity = Integer.parseInt(console.nextLine());
        int courses = (int)Math.ceil((double)people / capacity);
        System.out.println(courses);
    }
}
