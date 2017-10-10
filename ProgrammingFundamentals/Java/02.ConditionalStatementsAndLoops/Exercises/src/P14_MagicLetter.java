import java.util.Scanner;
public class P14_MagicLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char a = console.nextLine().charAt(0);
        char b = console.nextLine().charAt(0);
        char c = console.nextLine().charAt(0);

        for(char i = a; i <= b; i++) {
            for(char j = a; j <= b; j++) {
                for(char k = a; k <= b; k++) {
                    boolean remLetter3 = (i != c) && (j != c) && (k != c);
                    if(remLetter3) {
                        System.out.print("" + i + j + k + " ");
                    }
                }
            }
        }
    }
}
