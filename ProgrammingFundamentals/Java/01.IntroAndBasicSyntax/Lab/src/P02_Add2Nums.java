import java.util.Scanner;
public class P02_Add2Nums {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int firstNum = Integer.parseInt(console.nextLine());
        int secondNum = Integer.parseInt(console.nextLine());
        System.out.format("%d + %d = %d",firstNum, secondNum, firstNum + secondNum);
    }
}
