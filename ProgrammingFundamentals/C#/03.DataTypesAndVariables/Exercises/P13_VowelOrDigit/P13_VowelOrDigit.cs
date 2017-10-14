using System;

namespace P13_VowelOrDigit
{
    class P13_VowelOrDigit
    {
        static void Main(string[] args)
        {
            char symbol = char.Parse(Console.ReadLine());

            switch (symbol)
            {
                case 'a': case 'A': case 'e': case 'E': case 'i': case 'I':
                case 'o': case 'O': case 'u': case 'U': case 'y': case 'Y':
                    Console.WriteLine("vowel");
                    break;
                case '0': case '1': case '2': case '3': case '4':
                case '5': case '6': case '7': case '8': case '9':
                    Console.WriteLine("digit");
                    break;
                default:
                    Console.WriteLine("other");
                    break;
            }
        }
    }
}
