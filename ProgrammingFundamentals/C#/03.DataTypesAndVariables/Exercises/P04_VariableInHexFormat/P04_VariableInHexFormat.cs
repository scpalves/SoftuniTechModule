using System;

namespace P04_VariableInHexFormat
{
    class P04_VariableInHexFormat
    {
        static void Main(string[] args)
        {
            string num = Console.ReadLine();
            int hex = Convert.ToInt32(num, 16);
            Console.WriteLine(hex);
        }
    }
}
