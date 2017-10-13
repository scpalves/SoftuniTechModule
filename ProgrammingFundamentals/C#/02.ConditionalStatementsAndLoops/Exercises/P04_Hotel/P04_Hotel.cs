using System;

namespace P04_Hotel
{
    class P04_Hotel
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int nights = int.Parse(Console.ReadLine());

            bool over7days = nights > 7 && nights < 14;
            bool over14days = nights > 14;

            double studio = 0;
            double doubleD = 0;
            double suite = 0;


            switch (month)
            {
                case "May":
                    studio = 50.0; doubleD = 65.0; suite = 75.0;
                    if (over7days)
                    {
                        studio = studio * 0.95; //Final price (with discount)
                    }
                    break;
                case "October":
                    studio = 50.0; doubleD = 65.0; suite = 75.0;
                    if (over7days)
                    {
                        studio = ((studio * nights) - 50.0) / nights; // -1 free night -> new studio value
                        studio *= 0.95; //Final price (with discount)
                    }
                    break;
                case "June":
                    studio = 60.0; doubleD = 72.0; suite = 82.0;
                    if (over14days)
                    {
                        doubleD *= 0.90; //Final price (with discount)
                    }
                    break;
                case "September":
                    studio = 60.0; doubleD = 72.0; suite = 82.0;
                    if (over14days)
                    {
                        doubleD *= 0.90; //Final price (with discount)
                    }
                    else if (over7days)
                    {
                        studio = ((studio * nights) - 60.0) / nights; // -1 free night -> new studio value
                    }
                    break;
                case "July":
                case "August":
                case "December":
                    studio = 68.0; doubleD = 77.0; suite = 89.0;
                    if (over14days)
                    {
                        suite *= 0.85; //Final price (with discount)
                    }
                    break;
            }
            Console.WriteLine($"Studio: {studio * nights:F2} lv.");
            Console.WriteLine($"Double: {doubleD * nights:F2} lv.");
            Console.WriteLine($"Suite: {suite * nights:F2} lv.");
        }
    }
}
