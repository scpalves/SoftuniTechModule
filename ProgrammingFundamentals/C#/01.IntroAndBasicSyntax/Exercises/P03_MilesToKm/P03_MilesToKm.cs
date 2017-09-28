using System;

namespace P03_MilesToKm
{
    class P03_MilesToKm
    {
        static void Main(string[] args)
        {
            double miles = double.Parse(Console.ReadLine());
            Console.WriteLine(String.Format("{0:0.00}", miles* 1.60934));
        }
    }
}
