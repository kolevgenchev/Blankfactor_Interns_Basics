package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {

        Stack<Integer> paper = new Stack<>();
        paper.add(0);
        paper.add(1);
        paper.add(1);
        paper.add(0);
        paper.add(0);

        Queue <Integer> tasks = new LinkedList<>();
        tasks.add(1);
        tasks.add(0);
        tasks.add(1);
        tasks.add(1);
        tasks.add(0);

      //  int firstTask = tasks.element();
        int count = 0;

       // while(!(tasks.isEmpty()) && count <= paper.size() + 1) // || firstTask < tasks.size())
        while(paper.size() > 0 || count >= paper.size())
        {
            if(paper.peek().equals(tasks.peek()))
            {
                paper.pop();
                tasks.poll();
                count = 0;
            } else
            {
                tasks.add(tasks.remove());
            }
                count++;
//            System.out.println(paper);
//            System.out.println(tasks);
//            System.out.println("---------");
        }
        System.out.println(count);

    }
}
