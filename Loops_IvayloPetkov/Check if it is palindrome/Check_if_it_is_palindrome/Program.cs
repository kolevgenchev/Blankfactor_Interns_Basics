static void palendrome()
{
    string x = Console.ReadLine();
    int a1 = x.Length;
    if (x[a1 - 1] == x[0])
    {
        Console.WriteLine("True");
    }
    else
    {
        Console.WriteLine("False");
    }
}

palendrome();