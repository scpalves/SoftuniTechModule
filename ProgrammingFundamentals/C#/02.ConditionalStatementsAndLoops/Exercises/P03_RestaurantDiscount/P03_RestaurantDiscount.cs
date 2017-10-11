using System;

namespace P03_RestaurantDiscount
{
    class P03_RestaurantDiscount
    {
        static void Main(string[] args)
        {    
            int people = int.Parse(Console.ReadLine());
            string desiredPackage = Console.ReadLine();
            //----------------GROUPS--------------------------------------------
            bool smallGroup = (people > 0) && (people <= 50);
            bool mediumGroup = (people > 50) && (people <= 100);
            bool largeGroup = (people > 100) && (people <= 120);
            bool noSpace = (people > 120);
            //----------------VALUES--------------------------------------------
            double packagePrice = 0;
            double pricePerPerson;
            string hall = "";
            //-------------------------------------------------------------------------------------
            switch (desiredPackage)
            {
                case "Normal":
                    packagePrice = 500.0;
                    if (smallGroup)
                    {
                        packagePrice += 2500.0; hall = "Small Hall";
                    }
                    else if (mediumGroup)
                    {
                        packagePrice += 5000.0; hall = "Terrace";
                    }
                    else if (largeGroup)
                    {
                        packagePrice += 7500.0; hall = "Great Hall";
                    }
                    packagePrice -= (packagePrice * 0.05);
                    break;
                //-------------------------------------------------------------------------------------
                case "Gold":
                    packagePrice = 750.0;
                    if (smallGroup)
                    {
                        packagePrice += 2500.0; hall = "Small Hall";
                    }
                    else if (mediumGroup)
                    {
                        packagePrice += 5000.0; hall = "Terrace";
                    }
                    else if (largeGroup)
                    {
                        packagePrice += 7500.0; hall = "Great Hall";
                    }
                    packagePrice -= (packagePrice * 0.1);
                    break;
                //-------------------------------------------------------------------------------------
                case "Platinum":
                    packagePrice = 1000.0;
                    if (smallGroup)
                    {
                        packagePrice += 2500.0; hall = "Small Hall";
                    }
                    else if (mediumGroup)
                    {
                        packagePrice += 5000.0; hall = "Terrace";
                    }
                    else if (largeGroup)
                    {
                        packagePrice += 7500.0; hall = "Great Hall";
                    }
                    packagePrice -= (packagePrice * 0.15);
                    break;
            }
            pricePerPerson = packagePrice / people;
            if (noSpace)
                Console.WriteLine("We do not have an appropriate hall.");
            else
            {
                Console.WriteLine($"We can offer you the {hall}");
                Console.WriteLine($"The price per person is {pricePerPerson:F2}$");
            }
        }
    }
}
