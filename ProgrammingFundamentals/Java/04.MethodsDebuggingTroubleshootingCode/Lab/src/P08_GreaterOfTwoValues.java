import java.util.Scanner;
public class P08_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type = console.nextLine();
        switch(type) {
            case "int":
                int firstInt = Integer.parseInt(console.nextLine());
                int secondInt = Integer.parseInt(console.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = console.nextLine().charAt(0);
                char secondChar = console.next().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = console.nextLine();
                String secondString = console.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    static int getMax(int first, int second) {
        int max = (first >= second) ? first : second;
        return max;
    }

    static char getMax(char first, char second) {
        char max = (first >= second) ? first : second;
        return max;
    }

    static String getMax(String first, String second) {
        int find = first.compareTo(second);
        String max = (find >= 0) ? first : second;
        return max;
    }
}
