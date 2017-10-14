using System;

namespace P09_RefactorSpecialNumbers
{
    class P09_RefactorSpecialNumbers
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

