import java.util.Scanner;
public class P08_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double length, width, height = 0.0;

        System.out.print("Length: ");
            length = Double.parseDouble(console.nextLine());
        System.out.print("Width: ");
            width = Double.parseDouble(console.nextLine());
        System.out.print("Height: ");
            height = Double.parseDouble(console.nextLine());

        double volume = (length * width * height) / 3;
        System.out.format("Pyramid Volume: %.2f%n", volume);
    }
}
