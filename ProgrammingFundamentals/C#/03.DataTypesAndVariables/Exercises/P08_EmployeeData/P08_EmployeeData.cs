using System;

namespace P08_EmployeeData
{
    class P08_EmployeeData
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            byte age = byte.Parse(Console.ReadLine());
            char sex = char.Parse(Console.ReadLine());
            long id = long.Parse(Console.ReadLine());
            int employeeNumber = int.Parse(Console.ReadLine());

            Console.WriteLine($"First name: {firstName}");
            Console.WriteLine($"Last name: {lastName}");
            Console.WriteLine($"Age: {age}");
            if (sex == 'm' || sex == 'f')
            {
                Console.WriteLine($"Gender: {sex}");

            }
            Console.WriteLine($"Personal ID: {id}");
            Console.WriteLine($"Unique Employee number: {employeeNumber}");
        }
    }
}
