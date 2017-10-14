using System;

namespace P05_SpecialNumbers
{
    class P05_SpecialNumbers
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            for (int i = 1; i <= number; i++)
            {
                int sum = 0, digits = i;
                while (digits > 0)
                {
                    sum += digits % 10;
                    digits /= 10;
                }
                bool condition = (sum == 5 || sum == 7 || sum == 11);
                
                Console.WriteLine(condition ? $"{i} -> True" : $"{i} -> False");
            }
        }
    }
}
