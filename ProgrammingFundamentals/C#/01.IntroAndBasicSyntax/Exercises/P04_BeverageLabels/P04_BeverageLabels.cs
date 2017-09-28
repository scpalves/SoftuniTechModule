using System;

namespace P04_BeverageLabels
{
    class P04_BeverageLabels
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int volume = int.Parse(Console.ReadLine());
            int energy = int.Parse(Console.ReadLine());
            int sugar = int.Parse(Console.ReadLine());
            double kcal = volume * (energy / 100.0);
            double g = volume * (sugar / 100.0);
            
            Console.WriteLine("{0}ml {1}:", volume, name);
            Console.WriteLine("{0}kcal, {1}g sugars", kcal, g);
        }
    }
}
