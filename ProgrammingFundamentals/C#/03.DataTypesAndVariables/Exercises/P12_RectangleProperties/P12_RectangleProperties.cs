using System;

namespace P12_RectangleProperties
{
    class P12_RectangleProperties
    {
        static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());

            // Calculating - perimeter - area - diagonal
            Console.WriteLine((2 * width) + (2 * height) + Environment.NewLine + (width * height) + Environment.NewLine +
                                Math.Sqrt((width * width) + (height * height)));
        }
    }
}
