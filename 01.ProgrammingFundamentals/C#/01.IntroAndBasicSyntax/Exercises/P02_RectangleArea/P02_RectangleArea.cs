using System;

namespace P02_RectangleArea
{
    class P02_RectangleArea
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());
            double result = a * b;
            Console.WriteLine($"{result:F2}");
        }
    }
}
