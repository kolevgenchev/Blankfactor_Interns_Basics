using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;


namespace Application
{
    class Program
    {
        static void Main(string[] args)
        {
            string user_input = Console.ReadLine();
            string clean_user_input = Regex.Replace(user_input, @"[^A-Za-z ]+", "").ToLower();

            string[] final_sentece_word = clean_user_input.Split(' ', StringSplitOptions.RemoveEmptyEntries);


            Dictionary<string, int> most_used_word = new Dictionary<string, int>();

            foreach (string word in final_sentece_word)
            {
                if (most_used_word.ContainsKey(word))
                {
                    most_used_word[word]++;
                }
                else
                {
                    most_used_word[word] = 1;
                }
            }

            string most_common_word = most_used_word.OrderByDescending(kv => kv.Value).First().Key;
            Console.WriteLine(most_common_word);


        }
    }
}