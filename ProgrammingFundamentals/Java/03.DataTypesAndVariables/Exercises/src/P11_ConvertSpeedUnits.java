import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class P11_ConvertSpeedUnits {
    public static void main(String[] args) {

    //Doesn't work in judge, the tests are made for c#...

        Scanner console = new Scanner(System.in);
        float meters = Float.parseFloat(console.nextLine());
        byte hours = Byte.parseByte(console.nextLine());
        byte minutes = Byte.parseByte(console.nextLine());
        byte seconds = Byte.parseByte(console.nextLine());
        float sumSeconds = (hours * 3600) + (minutes * 60) + seconds;
        float sumMinutes = (sumSeconds / 3600) % 60;

        float km = meters / 1000;
        float miles = meters / 1609;
        //DecimalFormat df = new DecimalFormat("#.######");
        //df.setRoundingMode(RoundingMode.HALF_UP);
        System.out.format(/*df.format*/((meters / sumSeconds)) + System.lineSeparator() +
                            /*df.format*/((km / sumMinutes)) + System.lineSeparator() +
                            /*df.format*/((miles / sumMinutes)));
    }
}