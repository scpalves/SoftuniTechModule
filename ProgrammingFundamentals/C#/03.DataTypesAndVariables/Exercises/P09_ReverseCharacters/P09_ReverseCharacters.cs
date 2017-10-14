using System;

namespace P09_ReverseCharacters
{
    class P09_ReverseCharacters
    {
        static void Main(string[] args)
        {
            char first = char.Parse(Console.ReadLine());
            char second = char.Parse(Console.ReadLine());
            char third = char.Parse(Console.ReadLine());

            Console.WriteLine("" + third + second + first);
        }
    }
}
