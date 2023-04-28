package DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> papersType = new LinkedList<>();
        papersType.add(0);
        papersType.add(1);

        String[] task = {"task1",""};
        Stack<Integer> papers = new Stack<>(0,1,1,0,0,1,0,0,0,1);
        Queue<Integer> tasks = new Queue<>();

        NumberOfUnfinishedTasks(tasks,papers);


        

    }
    public static int NumberOfUnfinishedTasks (String[] tasks, LinkedList<Integer> papersType)
    {
        int unabledTasks = 0;




        return unabledTasks ;
    }
}
