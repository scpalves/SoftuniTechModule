using System;

namespace P17_PrintPartOfASCIITable
{
    class P17_PrintPartOfASCIITable
    {
        static void Main(string[] args)
        {
            int startIndex = int.Parse(Console.ReadLine());
            int endIndex = int.Parse(Console.ReadLine());

            for(int i = startIndex; i <= endIndex; i++)
            {
                Console.Write("" + (char)i + " ");
            }
        }
    }
}
