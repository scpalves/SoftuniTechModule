import java.util.Scanner;
public class P16_ComparingFloats {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNum = Double.parseDouble(console.nextLine());
        double secondNum = Double.parseDouble(console.nextLine());
        double epsilon = 0.000001;
        System.out.println((Math.abs(firstNum - secondNum) < epsilon) ? "True" : "False");
    }
}
