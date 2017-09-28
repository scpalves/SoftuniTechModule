using System;

namespace P02_Add2Nums
{
    class P02_Add2Nums
    {
        static void Main(string[] args)
        {
            int firstNumber = int.Parse(Console.ReadLine());
            int secondNumber = int.Parse(Console.ReadLine());
            Console.WriteLine($"{firstNumber} + {secondNumber} = {firstNumber + secondNumber}");     
        }
    }
}
