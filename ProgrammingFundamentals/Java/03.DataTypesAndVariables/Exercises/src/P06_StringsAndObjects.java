import java.util.Scanner;
public class P06_StringsAndObjects {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String hello = console.nextLine();
        String world = console.nextLine();
        String concat = hello + " " + world;
        System.out.println(concat);
    }
}
