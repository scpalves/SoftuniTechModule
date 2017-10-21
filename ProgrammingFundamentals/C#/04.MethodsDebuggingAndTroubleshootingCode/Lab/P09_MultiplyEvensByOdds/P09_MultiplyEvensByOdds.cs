using System;

namespace P09_MultiplyEvensByOdds
{
    class P09_MultiplyEvensByOdds
    {
        static void Main(string[] args)
        {
            int number = Math.Abs(int.Parse(Console.ReadLine()));
            Console.WriteLine(GetProductOfEvensAndOdds(number));
        }

        static int GetProductOfEvensAndOdds(int number)
        {
            int evenSum = GetEvenSum(number);
            int oddSum = GetOddSum(number);
            int product = evenSum * oddSum;
            return product;
        }

        static int GetEvenSum(int number)
        {
            int sum = 0;
            while (number > 0)
            {
                int lastDigit = number % 10;
                if (lastDigit % 2 == 0)
                {
                    sum += lastDigit;
                }
                number /= 10;
            }
            return sum;
        }

        static int GetOddSum(int number)
        {
            int sum = 0;
            while (number > 0)
            {
                int lastDigit = number % 10;
                if (lastDigit % 2 != 0)
                {
                    sum += lastDigit;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
