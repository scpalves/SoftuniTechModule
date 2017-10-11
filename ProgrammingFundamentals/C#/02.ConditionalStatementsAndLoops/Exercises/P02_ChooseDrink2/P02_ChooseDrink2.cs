using System;

namespace P02_ChooseDrink2
{
    class P02_ChooseDrink2
    {
        static void Main(string[] args)
        {
            string profession = Console.ReadLine();
            int quantity = int.Parse(Console.ReadLine());
            double price = -1.0;
            switch (profession)
            {
                case "Athlete":
                    price = quantity * 0.70;
                    Console.WriteLine($"The {profession} has to pay {price:F2}.");
                    break;
                case "Businessman":
                case "Businesswoman":
                    price = quantity * 1.00;
                    Console.WriteLine($"The {profession} has to pay {price:F2}.");
                    break;
                case "SoftUni Student":
                    price = quantity * 1.70;
                    Console.WriteLine($"The {profession} has to pay {price:F2}.");
                    break;
                default:
                    price = quantity * 1.20;
                    Console.WriteLine($"The {profession} has to pay {price:F2}.");
                    break;
            }
        }
    }
}
