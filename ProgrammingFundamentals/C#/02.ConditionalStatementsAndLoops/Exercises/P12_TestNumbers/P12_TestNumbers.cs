using System;

namespace P12_TestNumbers
{
    class P12_TestNumbers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int m = int.Parse(Console.ReadLine());
            int limit = int.Parse(Console.ReadLine());
            int sum = 0, count = 0;

            for (; n >= 1; n--)
            {
                for (int i = 1; m >= i; i++)
                {
                    count++;
                    sum += (n * i) * 3;
                    if (sum >= limit)
                    {
                        Console.WriteLine($"{count} combinations");
                        Console.WriteLine($"Sum: {sum} >= {limit}");
                        return;
                    }
                }
            }
            Console.WriteLine($"{count} combinations", count);
            Console.WriteLine($"Sum: {sum}");
        }
    }
}
