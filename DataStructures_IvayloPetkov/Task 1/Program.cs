using System;

namespace Application
{
    class Program
    {

        static void function()
        {

            Console.Write("What type of papers are loaded into the printer right now? : plain - 0   or   glossy - 1?");
            string type_of_paper = Console.ReadLine();

            Console.Write("How many tasks does each user have? ");
            int num_tasks = int.Parse(Console.ReadLine());

            string[] users = { "User 1", "User 2", "User 3", "User 4" };
            string[,] task_types = new string[users.Length, num_tasks];

            for (int i = 0; i < users.Length; i++)
            {
                Console.WriteLine($"Enter the type of paper for {users[i]}'s tasks:");

                for (int j = 0; j < num_tasks; j++)
                {
                    Console.Write($"Task {j + 1}: ");
                    task_types[i, j] = Console.ReadLine();
                }
            }

            Console.WriteLine("The tasks from the following users will be executed:");
            for (int i = 0; i < users.Length; i++)
            {
                for (int j = 0; j < num_tasks; j++)
                {
                    if (task_types[i, j] == type_of_paper)
                    {
                        Console.WriteLine($"{users[i]} - Task {j + 1}");
                    }
                }
            }
        }

        static void Main(string[] args)
        {
            function();
        }
    }
}