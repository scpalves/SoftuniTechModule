using System;

namespace P11_ConvertSpeedUnits
{
    class P11_ConvertSpeedUnits
    {
        static void Main(string[] args)
        {
            float meters = float.Parse(Console.ReadLine());
            byte hours = byte.Parse(Console.ReadLine());
            byte minutes = byte.Parse(Console.ReadLine());
            byte seconds = byte.Parse(Console.ReadLine());
            float sumSeconds = (hours * 3600) + (minutes * 60) + seconds;
            float sumMinutes = (sumSeconds / 3600) % 60;

            float km = meters / 1000;
            float miles = meters / 1609;

            Console.WriteLine((meters / sumSeconds) + Environment.NewLine + (km / sumMinutes) + Environment.NewLine + 
                (miles / sumMinutes));
        }
    }
}
