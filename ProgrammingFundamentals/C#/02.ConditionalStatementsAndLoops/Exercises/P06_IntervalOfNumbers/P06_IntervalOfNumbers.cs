using System;

namespace P06_IntervalOfNumbers
{
    class P06_IntervalOfNumbers
    {
        static void Main(string[] args)
        {
            int start = int.Parse(Console.ReadLine());
            int end = int.Parse(Console.ReadLine());

            if (start < end)
            {
                for (int i = start; i <= end; i++)
                {
                    Console.WriteLine(i);
                }
            }
            else
            {
                for (int i = end; i <= start; i++)
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
