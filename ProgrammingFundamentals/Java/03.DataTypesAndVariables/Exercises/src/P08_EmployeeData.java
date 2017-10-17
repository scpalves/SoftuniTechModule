import java.util.Scanner;
public class P08_EmployeeData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstName = console.nextLine();
        String lastName = console.nextLine();
        byte age = Byte.parseByte(console.nextLine());
        char sex = console.nextLine().charAt(0);
        long id = Long.parseLong(console.nextLine());
        int employeeNumber = Integer.parseInt(console.nextLine());

        System.out.format("First name: %s%n", firstName);
        System.out.format("Last name: %s%n", lastName);
        System.out.format("Age: %d%n", age);
        if (sex == 'm' || sex == 'f')
        {
            System.out.format("Gender: %s%n", sex);

        }
        System.out.format("Personal ID: %d%n", id);
        System.out.format("Unique Employee number: %d%n", employeeNumber);
    }
}
