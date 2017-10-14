using System;

namespace P02_CircleAreaPrecision12
{
    class P02_CircleAreaPrecision12
    {
        static void Main(string[] args)
        {
            double r = double.Parse(Console.ReadLine());
            Console.WriteLine($"{Math.PI*r*r:F12}");
        }
    }
}
