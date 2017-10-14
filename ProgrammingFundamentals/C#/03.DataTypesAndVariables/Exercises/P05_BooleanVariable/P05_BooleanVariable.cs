using System;

namespace P05_BooleanVariable
{
    class P05_BooleanVariable
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            bool boolean = Convert.ToBoolean(input);

            Console.WriteLine(boolean ? "Yes" : "No");
        }
    }
}
