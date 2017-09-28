using System;

namespace P02_PassedOrFailed
{
    class P02_PassedOrFailed
    {
        static void Main(string[] args)
        {
            double grade = double.Parse(Console.ReadLine());
            Console.WriteLine((grade >= 3.00) ? "Passed!":"Failed!");
        }
    }
}
