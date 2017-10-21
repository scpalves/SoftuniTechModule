using System;

namespace P05_TemperatureConversion
{
    class P05_TemperatureConversion
    {
        static void Main(string[] args)
        {   
            double fahrenheit = double.Parse(Console.ReadLine());
            double celsius = FahrenheitToCelsius(fahrenheit);
            Console.WriteLine($"{celsius:F2}");
        }

        static double FahrenheitToCelsius(double fahrenheit)
        {
            double result = (fahrenheit - 32) * 5 / 9;
            return result;
        }
    }
}
