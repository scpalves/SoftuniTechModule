using System;

namespace P19_TheaThePhotographer
{
    class Program
    {
        static void Main(string[] args)
        {
            double pictures = double.Parse(Console.ReadLine());
            double filterTime = double.Parse(Console.ReadLine());       
            double filterFactor = double.Parse(Console.ReadLine());
            double uploadTime = double.Parse(Console.ReadLine());

            double filteredPictures = Math.Ceiling((filterFactor / 100.0) * pictures);
            long filterTimeSeconds = (long)(filterTime * pictures);      
            long uploadTimeSeconds = (long)(uploadTime * filteredPictures);
            long sumSeconds = filterTimeSeconds + uploadTimeSeconds;

            long days = (sumSeconds / 86400);
            long hours = ((sumSeconds % 86400) / 3600);
            long minutes = (((sumSeconds % 86400) % 3600) / 60);
            long seconds = (((sumSeconds % 86400) % 3600) % 60);

            Console.WriteLine($"{days:D}:{hours:D2}:{minutes:D2}:{seconds:D2}");
        }
    }
}
