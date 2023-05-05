using System;

namespace BlankfactorLoops
{
    class Program
    {
        static void Main(string[] args)
        {
            string word1 = "abc";
            string word2 = "pqr";

            for (int i = 0; i < word1.Length; i++)
            {
                Console.Write(string.Concat(word1[i]));

                Console.Write(string.Concat(word2[i]));
            }


            //was fixed for diff lenght on words but lost it because of trying to fix DS_Store and deleting the branch
        }
    }
}