using System;

namespace P07_CakeIngredients
{
    class P07_CakeIngredients
    {
        static void Main(string[] args)
        {
            for (int i = 0; i <= 20; i++)
            {
                string ingredient = Console.ReadLine();
                if (ingredient == "Bake!")
                {
                    Console.WriteLine($"Preparing cake with {i} ingredients.");
                    break;
                }
                Console.WriteLine($"Adding ingredient {ingredient}.");
            }
        }
    }
}
