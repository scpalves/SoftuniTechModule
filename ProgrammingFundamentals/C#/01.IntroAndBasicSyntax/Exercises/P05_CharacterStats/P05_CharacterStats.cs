using System;

namespace P05_CharacterStats
{
    public class P05_CharacterStats
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int currentHealth = int.Parse(Console.ReadLine());
            int maximumHealth = int.Parse(Console.ReadLine());
            int currentEnergy = int.Parse(Console.ReadLine());
            int maximumEnergy = int.Parse(Console.ReadLine());

            Console.WriteLine($"Name: {name}");
            Console.WriteLine($"Health: |{new string('|', currentHealth)}" +
                              $"{new string('.', maximumHealth - currentHealth)}|");

            Console.WriteLine($"Energy: |{new string('|', currentEnergy)}" +
                              $"{new string('.', maximumEnergy - currentEnergy)}|");
        }
    }
}