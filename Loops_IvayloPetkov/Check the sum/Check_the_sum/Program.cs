string firstWord = "acb";
string secondWord = "cba";
string targetWord = "cdb";
int counter_firstWord = 0;
int counter_secondWord = 0;
int counter_thirdWord = 0;
var new_first_word = firstWord.Length;
var new_second_word = secondWord.Length;
var new_target_word = targetWord.Length;
for (int i = 0; i < new_first_word; i++)
{
    if (firstWord[i] == 'a')
    {
        counter_firstWord = counter_firstWord + 1;
    }
    else if (firstWord[i] == 'b')
    {
        counter_firstWord = counter_firstWord + 2;
    }
    else if (firstWord[i] == 'c')
    {
        counter_firstWord = counter_firstWord + 3;
    }
    else if (firstWord[i] == 'd')
    {
        counter_firstWord = counter_firstWord + 4;
    }
}
for (int i = 0; i < new_second_word; i++)
{
    if (firstWord[i] == 'a')
    {
        counter_secondWord = counter_secondWord + 1;
    }
    else if (firstWord[i] == 'b')
    {
        counter_secondWord = counter_secondWord + 2;
    }
    else if (firstWord[i] == 'c')
    {
        counter_secondWord = counter_secondWord + 3;
    }
    else if (firstWord[i] == 'd')
    {
        counter_secondWord = counter_secondWord + 4;
    }
}
for (int i = 0; i < new_target_word; i++)
{
    if (firstWord[i] == 'a')
    {
        counter_thirdWord = counter_thirdWord + 1;
    }
    else if (firstWord[i] == 'b')
    {
        counter_thirdWord = counter_thirdWord + 2;
    }
    else if (firstWord[i] == 'c')
    {
        counter_thirdWord = counter_thirdWord + 3;
    }
    else if (firstWord[i] == 'd')
    {
        counter_thirdWord = counter_thirdWord + 4;
    }
}
if (counter_firstWord == counter_secondWord && counter_firstWord == counter_thirdWord && counter_secondWord == counter_thirdWord)
{
    Console.WriteLine("True");
}