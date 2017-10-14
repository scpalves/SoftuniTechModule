using System;

namespace P16_ComparingFloats
{
    class P16_ComparingFloats
    {
        static void Main(string[] args)
        {
            double firstNum = double.Parse(Console.ReadLine());
            double secondNum = double.Parse(Console.ReadLine());
            double epsilon = 0.000001;

            Console.WriteLine(Math.Abs(firstNum - secondNum) < epsilon);
        }
    }
}
