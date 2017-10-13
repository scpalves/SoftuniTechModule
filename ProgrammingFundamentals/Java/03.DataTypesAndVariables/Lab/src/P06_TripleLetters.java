import java.util.Scanner;
public class P06_TripleLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        StringBuilder output = new StringBuilder();

        for(int first = 0; first < n; first++) {
            for(int second = 0; second < n; second++) {
                for(int third = 0; third < n; third++) {
                    String currentLine = String.format("%s%s%s",
                            (char)('a' + first),
                            (char)('a' + second),
                            (char)('a' + third));
                    output.append(currentLine + System.lineSeparator());
                }
            }
        }
        System.out.println(output);
    }
}
