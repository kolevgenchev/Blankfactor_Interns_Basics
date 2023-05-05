import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
/*
        Stack<Integer> paper = new Stack<>();
        paper.add(1);
        paper.add(1);
        paper.add(0);


        Queue <Integer> tasks = new LinkedList<>();
        tasks.add(1);
        tasks.add(1);
        tasks.add(1);


        int count = 0;

        while(paper.size() > 0 && count <= paper.size() + 1)
        {
            if(paper.peek().equals(tasks.peek()))
            {
                paper.pop();
                tasks.remove();
                tasks.pull();
                count = 0;
            } else
            {
                tasks.add(tasks.remove());
                count++;
            }
        }
        System.out.println(tasks.size());
*/
/*
        List<Integer> papers = new LinkedList<>();
        papers.add(0);
        papers.add(0);
        papers.add(0);
        papers.add(0);
        papers.add(0);
        papers.add(0);
        papers.add(0);
        List<Integer> tasks = new LinkedList<>();
        tasks.add(1);
        tasks.add(1);
        tasks.add(1);
        tasks.add(1);
        tasks.add(1);
        tasks.add(1);

        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i) == papers.get(i))
            {

            }
        }

        */
    }
}