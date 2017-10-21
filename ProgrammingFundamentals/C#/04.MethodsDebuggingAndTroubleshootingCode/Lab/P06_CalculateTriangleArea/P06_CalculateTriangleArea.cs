using System;

namespace P06_CalculateTriangleArea
{
    class P06_CalculateTriangleArea
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());
            Console.WriteLine(GetTriangleArea(width, height));
        }

        static double GetTriangleArea(double width, double height)
        {
            double result = width * height / 2;
            return result;
        }
    }
}
