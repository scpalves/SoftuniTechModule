using System;

namespace P10_MultiplicationTable2
{
    class P10_MultiplicationTable2
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            int multiplier = int.Parse(Console.ReadLine());

            do
            {
                Console.WriteLine($"{number} X {multiplier} = {number * multiplier}");
                multiplier++;
            } while (multiplier <= 10);
        }
    }
}
