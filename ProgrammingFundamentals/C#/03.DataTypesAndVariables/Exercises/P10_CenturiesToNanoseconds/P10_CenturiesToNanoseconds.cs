using System;

namespace P10_CenturiesToNanoseconds
{
    class P10_CenturiesToNanoseconds
    {
        static void Main(string[] args)
        {
            int centuries = int.Parse(Console.ReadLine());
            int years = centuries * 100;
            int days = (int)(years * 365.2422);
            long hours = (long)(days * 24);
            long minutes = hours * 60L;
            decimal seconds = minutes * 60M;
            decimal milliseconds = seconds * 1000M;
            decimal microseconds = milliseconds * 1000M;
            decimal nanoseconds = microseconds * 1000M;

            Console.WriteLine($"{centuries} centuries = {years} years = {days} days = {hours} hours = {minutes} minutes = " +
                $"{seconds} seconds = {milliseconds} milliseconds = {microseconds} microseconds = {nanoseconds} nanoseconds");
        }
    }
}
