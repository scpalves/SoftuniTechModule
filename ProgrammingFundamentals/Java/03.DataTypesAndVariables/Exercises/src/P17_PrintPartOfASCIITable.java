import java.util.Scanner;
public class P17_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int startIndex = Integer.parseInt(console.nextLine());
        int endIndex = Integer.parseInt(console.nextLine());

        for(int i = startIndex; i <= endIndex; i++)
        {
            System.out.print("" + (char)i + " ");
        }
    }
}
