using System;
using System.Text;

namespace P06_TripleLetters
{
    class P06_TripleLetters
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            StringBuilder output = new StringBuilder();

            for (int first = 0; first < n; first++)
            {
                for (int second = 0; second < n; second++)
                {
                    for (int third = 0; third < n; third++)
                    {
                        String currentLine = String.Format("{0}{1}{2}",
                                (char)('a' + first),
                                (char)('a' + second),
                                (char)('a' + third));
                        output.Append(currentLine + System.Environment.NewLine);
                    }
                }
            }
            Console.WriteLine(output);  
        }
    }
}
