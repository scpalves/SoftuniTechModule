import java.util.Scanner;
public class P19_TheaThePhotographer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double pictures = Double.parseDouble(console.nextLine());
        double filterTime = Double.parseDouble(console.nextLine());
        double filterFactor = Double.parseDouble(console.nextLine());
        double uploadTime = Double.parseDouble(console.nextLine());

        double filteredPictures = Math.ceil((filterFactor / 100.0) * pictures);
        long filterTimeSeconds = (long)(filterTime * pictures);
        long uploadTimeSeconds = (long)(uploadTime * filteredPictures);
        long sumSeconds = filterTimeSeconds + uploadTimeSeconds;

        long days = (sumSeconds / 86400);
        long hours = ((sumSeconds % 86400) / 3600);
        long minutes = (((sumSeconds % 86400) % 3600) / 60);
        long seconds = (((sumSeconds % 86400) % 3600) % 60);

        System.out.format("%d:%02d:%02d:%02d", days, hours, minutes ,seconds);
    }
}
