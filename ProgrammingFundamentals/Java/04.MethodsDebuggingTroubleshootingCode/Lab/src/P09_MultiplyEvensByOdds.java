import java.util.Scanner;
public class P09_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(console.nextLine()));
        System.out.println(getProductOfEvensAndOdds(number));
    }

    static int getProductOfEvensAndOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        int product = evenSum * oddSum;
        return product;
    }

    static int getEvenSum(int number) {
        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }

    static int getOddSum(int number) {
        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }





}
