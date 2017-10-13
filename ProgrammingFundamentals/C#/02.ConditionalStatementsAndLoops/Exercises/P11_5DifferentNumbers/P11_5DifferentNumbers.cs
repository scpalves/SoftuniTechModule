using System;

namespace P11_5DifferentNumbers
{
    class P11_5DifferentNumbers
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            if (a + 4 >= b)
            {
                Console.WriteLine("No");
            }
            else
            {
                for (int n1 = a; n1 <= b; n1++)
                {
                    for (int n2 = a; n2 <= b; n2++)
                    {
                        for (int n3 = a; n3 <= b; n3++)
                        {
                            for (int n4 = a; n4 <= b; n4++)
                            {
                                for (int n5 = a; n5 <= b; n5++)
                                {
                                    bool c1 = (a <= n1);
                                    bool c2 = (n1 < n2);
                                    bool c3 = (n2 < n3);
                                    bool c4 = (n3 < n4);
                                    bool c5 = (n4 < n5);
                                    bool c6 = (n5 <= b);

                                    if (c1 && c2 && c3 && c4 && c5 && c6)
                                    {
                                        Console.WriteLine($"{n1} {n2} {n3} {n4} {n5}");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
