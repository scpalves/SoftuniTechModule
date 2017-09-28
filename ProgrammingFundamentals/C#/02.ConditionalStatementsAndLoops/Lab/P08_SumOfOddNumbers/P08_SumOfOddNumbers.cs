using System;

namespace P08_SumOfOddNumbers
{
    class P08_SumOfOddNumbers
    {
        static void Main(string[] args)
        {
            int nums = int.Parse(Console.ReadLine());
            int odd = 1;
            int sum = 0;
            for(int i = 1; i <= nums; i++)
            {
                Console.WriteLine(odd);
                sum += odd;
                odd += 2;
            }
            Console.WriteLine($"Sum: {sum}");
        }
    }
}
