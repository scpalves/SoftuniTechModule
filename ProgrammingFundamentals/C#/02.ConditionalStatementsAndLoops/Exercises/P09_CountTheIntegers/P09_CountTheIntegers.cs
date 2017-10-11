using System;

namespace P09_CountTheIntegers
{
    class P09_CountTheIntegers
    {
        static void Main(string[] args)
        {
            int i = 0;
            try
            {
                for (i = 0; i <= 100; i++)
                {
                    int count = int.Parse(Console.ReadLine());
                }
            }
            catch (Exception hex)
            {
                Console.WriteLine(i);
            }
        }
    }
}
