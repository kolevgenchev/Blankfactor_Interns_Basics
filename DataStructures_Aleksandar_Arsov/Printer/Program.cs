//PRINTER TASK 1 OF DATA STRUCTURES
//The printer in the office has two types of paper: plain and glossy, which are represented by the numbers 0 and 1, respectively.
//    Employees start submitting tasks to the printer. Each job is specifying the type of paper it requires.
//The number of papers in the printer is equal to the number of tasks.
//Before the execution of each task:
//If it prefers the paper type that is currently available, the task will be executed.
//Otherwise, the paper remains unused and ready for the next task. And the current task will be placed as last and will wait for all others to be done
//so it can try again.
//This continues until none of the tasks want to take the top paper and are thus unable to print the document.
//Write a function that accepts two parameters: an array of tasks and an array of papers’ type and returns the number
//    of tasks that are unable to finish.

class Program
{
    public static int CountUnfinishedTasks(int[] tasks, int[] papers)
    {
        int numTasks = tasks.Length;
        int numPapers = papers.Length;
        int numUnfinished = 0;
        int topPaperIndex = 0;

        for (int i = 0; i < numTasks; i++)
        {
            int paperType = tasks[i];


            if (papers[topPaperIndex] == paperType)
            {
                topPaperIndex++;
                if (topPaperIndex == numPapers)
                {

                    topPaperIndex = 0;
                }
            }
            else
            {

                numUnfinished++;
            }
        }

        return numUnfinished;
    }
    static void Main(string[] args)
    {

        int[] tasks = { 1, 1, 0, 0, 0, 0 };
        int[] papers = { 0, 0, 0, 0, 0, 0 };

        int numUnfinished = CountUnfinishedTasks(tasks, papers);

        Console.WriteLine($"Number of unfinished tasks: {numUnfinished}");
    }

}

