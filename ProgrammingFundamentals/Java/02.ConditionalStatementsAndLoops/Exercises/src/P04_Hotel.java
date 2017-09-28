import java.util.Scanner;
public class P04_Hotel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.nextLine();
        int nights = Integer.parseInt(console.nextLine());

        boolean over7days = nights > 7 && nights < 14;
        boolean over14days = nights > 14;

        double studio = 0;
        double doubleD = 0;
        double suite = 0;

        switch(month) {
            case "May":
                studio = 50.0; doubleD = 65.0; suite = 75.0;
                if(over7days) {
                    studio = studio * 0.95; //Final price (with discount)
                }
                break;
            case "October":
                studio = 50.0; doubleD = 65.0; suite = 75.0;
                if(over7days) {
                    studio = ((studio * nights) - 50.0)/nights; // -1 free night -> new studio value
                    studio *= 0.95; //Final price (with discount)
                }
                break;
            case "June":
                studio = 60.0; doubleD = 72.0; suite = 82.0;
                if(over14days) {
                    doubleD *= 0.90; //Final price (with discount)
                }
                break;
            case "September":
                studio = 60.0; doubleD = 72.0; suite = 82.0;
                if(over14days) {
                    doubleD *= 0.90; //Final price (with discount)
                } else if(over7days) {
                    studio = ((studio * nights) - 60.0) / nights; // -1 free night -> new studio value
                }
                break;
            case "July":
            case "August":
            case "December":
                studio = 68.0; doubleD = 77.0; suite = 89.0;
                if(over14days) {
                    suite *= 0.85; //Final price (with discount)
                }
                break;
        }
        System.out.format("Studio: %.2f lv." + System.lineSeparator(), studio * nights);
        System.out.format("Double: %.2f lv." + System.lineSeparator(), doubleD * nights);
        System.out.format("Suite: %.2f lv." + System.lineSeparator(), suite * nights);
    }
}
