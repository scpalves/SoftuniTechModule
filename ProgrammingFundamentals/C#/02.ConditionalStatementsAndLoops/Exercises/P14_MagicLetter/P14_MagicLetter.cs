using System;

namespace P14_MagicLetter
{
    class P14_MagicLetter
    {
        static void Main(string[] args)
        {
            char a = char.Parse(Console.ReadLine());
            char b = char.Parse(Console.ReadLine());
            char c = char.Parse(Console.ReadLine());

            for (char i = a; i <= b; i++)
            {
                for (char j = a; j <= b; j++)
                {
                    for (char k = a; k <= b; k++)
                    {
                        bool remLetter3 = (i != c) && (j != c) && (k != c);
                        if (remLetter3)
                        {
                            Console.Write("" + i + j + k + " ");
                        }
                    }
                }
            }
        }
    }
}
