import java.util.Scanner;
public class P05_ForeignLanguages {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String country = console.nextLine().toLowerCase();

        switch (country) {
            case "usa":
            case "england":
                System.out.println("English");
                break;
            case "spain":
            case "argentina":
            case "mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
