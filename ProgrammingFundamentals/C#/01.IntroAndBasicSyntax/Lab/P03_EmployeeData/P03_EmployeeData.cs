using System;

namespace P03_EmployeeData
{
    class P03_EmployeeData
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            int id = int.Parse(Console.ReadLine());
            double salary = double.Parse(Console.ReadLine());

            Console.WriteLine($"Name: {name}\r\n" +
                                $"Age: {age}\r\n" +
                                $"Employee ID: " + id.ToString("D8") + 
                                "\r\nSalary: " + String.Format("{0:0.00}", salary));
        }
    }
}
