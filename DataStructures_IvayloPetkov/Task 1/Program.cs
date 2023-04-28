static void function()
{
    string[] tasks = { "User 1", "User 2", "User 3" , "User 4"};
    string[] type_of_task = new string[] { "0", "1", "0" , "1"};
    Console.Write("What type of papers are loaded into the printer right now? : plain - 0   or   glossy - 1?");
    string type_of_paper = Console.ReadLine();

    for (int i = 0; i < type_of_task.Length; i++)
    {
        if (type_of_paper == type_of_task[i])
        {
            Console.WriteLine("The tasks from this user will be executed: " + tasks[i]);
        }
    }
}

function();