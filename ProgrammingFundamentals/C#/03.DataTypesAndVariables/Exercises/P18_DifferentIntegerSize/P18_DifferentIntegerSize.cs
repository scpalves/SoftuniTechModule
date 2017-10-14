using System;
using System.Numerics;

namespace P18_DifferentIntegerSize
{
    class P18_DifferentIntegerSize
    {
        static void Main(string[] args)
        {
            BigInteger num = BigInteger.Parse(Console.ReadLine());

            bool signedByte = (num >= sbyte.MinValue) && (num <= sbyte.MaxValue); // - +
            bool unsignedByte = (num >= byte.MinValue) && (num <= byte.MaxValue); // +
            bool signedShort = (num >= short.MinValue) && (num <= short.MaxValue); // - +
            bool UnsignedShort = (num >= ushort.MinValue) && (num <= ushort.MaxValue); // +
            bool signedInt = (num >= int.MinValue) && (num <= int.MaxValue); // - +
            bool unsignedInt = (num >= uint.MinValue) && (num <= uint.MaxValue); // +     

            if(num <= long.MaxValue)
            {
                Console.WriteLine($"{num} can fit in:");
                if (signedByte)
                {
                    Console.WriteLine("* sbyte");
                }
                if(unsignedByte)
                {
                    Console.WriteLine("* byte");
                }
                if(signedShort)
                {
                    Console.WriteLine("* short");
                }
                if(UnsignedShort)
                {
                    Console.WriteLine("* ushort");
                }
                if(signedInt)
                {
                    Console.WriteLine("* int");
                }
                if(unsignedInt)
                {
                    Console.WriteLine("* uint");
                }

                Console.WriteLine("* long");
            }
            else
            {
                Console.WriteLine($"{num} can't fit in any type");
            }
        }      
    }
}
