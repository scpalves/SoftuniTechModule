using System;

namespace P06_TheatrePromotions
{
    class P06_TheatrePromotions
    {
        static void Main(string[] args)
        {       
            string day = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());

            bool age1 = (age >= 0 && age <= 18);
            bool age2 = (age > 18 && age <= 64);
            bool age3 = (age > 64 && age <= 122);

            switch (day)
            {
                case "Weekday":
                    if (age1)
                    {
                        Console.WriteLine("12$");
                    }
                    else if (age2)
                    {
                        Console.WriteLine("18$");

                    }
                    else if (age3)
                    {
                        Console.WriteLine("12$");
                    }
                    else
                    {
                        Console.WriteLine("Error!");
                    }
                    break;
                case "Weekend":
                    if (age1)
                    {
                        Console.WriteLine("15$");
                    }
                    else if (age2)
                    {
                        Console.WriteLine("20$");

                    }
                    else if (age3)
                    {
                        Console.WriteLine("15$");
                    }
                    else
                    {
                        Console.WriteLine("Error!");
                    }
                    break;
                case "Holiday":
                    if (age1)
                    {
                        Console.WriteLine("5$");
                    }
                    else if (age2)
                    {
                        Console.WriteLine("12$");

                    }
                    else if (age3)
                    {
                        Console.WriteLine("10$");
                    }
                    else
                    {
                        Console.WriteLine("Error!");
                    }
                    break;
                default:
                    Console.WriteLine("Error!");
                    break;
            }
        }
    }
}
