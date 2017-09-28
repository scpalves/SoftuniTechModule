import java.util.Scanner;
public class P03_EmployeeData {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        int id = Integer.parseInt(console.nextLine());
        double salary = Double.parseDouble(console.nextLine());

        System.out.format("Name: %s%nAge: %d%nEmployee ID: %08d%nSalary: %.2f",
                name, age, id, salary);
    }
}
