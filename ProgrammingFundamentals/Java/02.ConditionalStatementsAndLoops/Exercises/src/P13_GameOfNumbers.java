import java.util.Scanner;
public class P13_GameOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        int magicNum = Integer.parseInt(console.nextLine());
        int sum = 0, count = 0;

        for(int i = n; i <= m; i++) {
            for(int j = n; j <= m; j++) {
                count++;
                sum = i + j;
                if(sum == magicNum) {
                    System.out.format("Number found! %d + %d = %d", j, i, magicNum);
                    return;
                }
            }
        }
        System.out.format("%d combinations - neither equals %d", count, magicNum);
    }
}
