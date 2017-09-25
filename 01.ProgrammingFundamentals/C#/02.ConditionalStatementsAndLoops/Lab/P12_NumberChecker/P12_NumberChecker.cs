using System;

namespace P12_NumberChecker
{
    class P12_NumberChecker
    {
        static void Main(string[] args)
        {
            try
            {
                int number = int.Parse(Console.ReadLine());
                Console.WriteLine("It is a number.");
            }
            catch (FormatException ex)
            {
                Console.WriteLine("Invalid input!");
            }
        }
    }
}
