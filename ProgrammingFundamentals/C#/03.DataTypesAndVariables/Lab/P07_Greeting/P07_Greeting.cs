﻿using System;

namespace P07_Greeting
{
    class P07_Greeting
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());

            Console.WriteLine($"Hello, {firstName} {lastName}. You are {age} years old.");           
        }
    }
}
