using System;

namespace P15_NeighbourWars
{
    class P15_NeighbourWars
    {
        static void Main(string[] args)
        {
            int PeshosDamage = int.Parse(Console.ReadLine());
            int GoshosDamage = int.Parse(Console.ReadLine());
            int PeshosHealth = 100;
            int GoshosHealth = 100;
            int turn = 1;

            while (PeshosHealth >= 1 && GoshosHealth >= 1)
            {
                if (turn % 2 == 1)
                {
                    GoshosHealth -= PeshosDamage;
                    if (GoshosHealth < 1)
                    {
                        Console.WriteLine($"Pesho won in {turn}th round.");
                        return;
                    }
                    Console.WriteLine($"Pesho used Roundhouse kick and reduced Gosho to {GoshosHealth} health.");
                    if (turn % 3 == 0)
                    {
                        PeshosHealth += 10;
                        GoshosHealth += 10;
                    }
                    turn++;
                }
                else
                {
                    PeshosHealth -= GoshosDamage;
                    if (PeshosHealth < 1)
                    {
                        Console.WriteLine($"Gosho won in {turn}th round.");
                        return;
                    }
                    Console.WriteLine($"Gosho used Thunderous fist and reduced Pesho to {PeshosHealth} health.");
                    if (turn % 3 == 0)
                    {
                        PeshosHealth += 10;
                        GoshosHealth += 10;
                    }
                    turn++;
                }
            }
        }
    }
}
