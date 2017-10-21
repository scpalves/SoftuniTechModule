using System;

namespace P08_GreaterOfTwoValues
{
    class P08_GreaterOfTwoValues
    {
        static void Main(string[] args)
        {
            String type = Console.ReadLine();
            switch (type)
            {
                case "int":
                    int firstInt = int.Parse(Console.ReadLine());
                    int secondInt = int.Parse(Console.ReadLine());
                    Console.WriteLine(GetMax(firstInt, secondInt));
                    break;
                case "char":
                    char firstChar = char.Parse(Console.ReadLine());
                    char secondChar = char.Parse(Console.ReadLine());
                    Console.WriteLine(GetMax(firstChar, secondChar));
                    break;
                case "string":
                    String firstString = Console.ReadLine();
                    String secondString = Console.ReadLine();
                    Console.WriteLine(GetMax(firstString, secondString));
                    break;
            }
        }

        static int GetMax(int first, int second)
        {
            int max = (first >= second) ? first : second;
            return max;
        }

        static char GetMax(char first, char second)
        {
            char max = (first >= second) ? first : second;
            return max;
        }

        static String GetMax(String first, String second)
        {
            int find = first.CompareTo(second);
            String max = (find >= 0) ? first : second;
            return max;
        }
    }
}
