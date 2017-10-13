using System;

namespace P05_WordInPlural
{
    class P05_WordInPlural
    {
        static void Main(string[] args)
        {
            String word = Console.ReadLine();

            if (word.EndsWith("y"))
            {
                word = word.Remove(word.Length - 1);
                Console.WriteLine(word + "ies");
            }
            else if (word.EndsWith("o") || word.EndsWith("ch") || word.EndsWith("s") ||
                  word.EndsWith("sh") || word.EndsWith("x") || word.EndsWith("z"))
            {
                Console.WriteLine(word + "es");
            }
            else
            {
                Console.WriteLine(word + "s");
            }
        }
    }
}
