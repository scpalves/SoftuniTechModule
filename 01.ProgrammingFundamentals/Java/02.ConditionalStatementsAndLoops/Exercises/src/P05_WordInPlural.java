import java.util.Scanner;
public class P05_WordInPlural {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        if(word.endsWith("y")) {
            System.out.println(word.substring(0,word.length()-1) + "ies");
        } else if(word.endsWith("o") || word.endsWith("ch") || word.endsWith("s") ||
                word.endsWith("sh") || word.endsWith("x") || word.endsWith("z")) {
            System.out.println(word + "es");
        } else {
            System.out.println(word + "s");
        }
    }
}
