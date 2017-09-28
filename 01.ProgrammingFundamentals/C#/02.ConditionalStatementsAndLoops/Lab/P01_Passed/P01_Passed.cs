using System;

namespace P01_Passed
{
    class P01_Passed
    {
        static void Main(string[] args)
        {
            double grade = double.Parse(Console.ReadLine());
            Console.WriteLine((grade >= 3.0) ? "Passed!":"");
        }
    }
}
