﻿using System;

namespace P08_RefactorVolumeOfPyramid
{
    class P08_RefactorVolumeOfPyramid
    {
        static void Main(string[] args)
        {
            double length, width, height = 0.0;

            Console.Write("Length: ");
            length = double.Parse(Console.ReadLine());
            Console.Write("Width: ");
            width = double.Parse(Console.ReadLine());
            Console.Write("Height: ");
            height = double.Parse(Console.ReadLine());

            double volume = (length * width * height) / 3;
            Console.WriteLine($"Pyramid Volume: {volume:F2}");
        }
    }
}
