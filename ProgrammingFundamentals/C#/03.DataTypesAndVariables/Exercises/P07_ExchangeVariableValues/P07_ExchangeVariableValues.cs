using System;

namespace P07_ExchangeVariableValues
{
    class P07_ExchangeVariableValues
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c;

            Console.WriteLine("Before:" + Environment.NewLine + $"a = {a}" + Environment.NewLine + $"b = {b}");
            c = a; a = b;
            Console.WriteLine("After:" + Environment.NewLine + $"a = {a}" + Environment.NewLine + $"b = {c}");
        }
    }
}
