using System;

namespace P04_DrawAFilledSquare
{
    class P04_DrawAFilledSquare
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            HeaderFooter(n);
            for(int i = 0; i < n-2; i++)
            {
                Middle(n);
            }
            HeaderFooter(n);
        }

        static void HeaderFooter(int num)
        {
            Console.WriteLine(new string('-', 2 * num));
        }

        static void Middle(int n)
        {
            Console.Write("-");
            for(int i = 1; i < n; i++)
            {
                Console.Write("\\/");
            }                    
            Console.WriteLine("-");
        }
    }
}
