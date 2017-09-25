using System;

namespace P11_OddNumber
{
    class P11_OddNumber
    {
        static void Main(string[] args)
        {   
            for (int i = 1; i <= 10; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (number % 2 == 0)
                {
                    Console.WriteLine("Please write an odd number.");
                }
                else
                {
                    Console.WriteLine("The number is: " + Math.Abs(number));
                    break;
                }
            }
        }
    }
}
