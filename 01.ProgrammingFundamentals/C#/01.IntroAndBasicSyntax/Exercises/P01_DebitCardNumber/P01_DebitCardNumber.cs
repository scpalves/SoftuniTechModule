﻿namespace P01_DebitCardNumber
{
    using System;
    class P01_DebitCardNumber
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int d = int.Parse(Console.ReadLine());
            Console.WriteLine($"{a:D4} {b:D4} {c:D4} {d:D4}");
        }
    }
}
