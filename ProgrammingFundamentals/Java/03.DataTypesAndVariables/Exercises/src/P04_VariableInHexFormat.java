import java.util.Scanner;
public class P04_VariableInHexFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String num = console.nextLine();
        num = num.substring(2); // 0xFE --> FE
        int hexToDecimal = Integer.valueOf(num, 16);
        System.out.println(hexToDecimal);
    }
}
