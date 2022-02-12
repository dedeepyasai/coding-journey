import java.util.*;

public class Queues {

    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();
        queue.add("Sai");
        queue.add("Datta");
        queue.add("Dedeepya Sai");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        // poll vs remove. Both returns the head of the queue but remove throws exception if the queue is empty
        // but poll returns null. So better to use remove as it can be handled properly.
        queue.remove();
        System.out.println(queue);
        queue.remove();
        if(queue.size()!=0){
            queue.remove();
        }else{
            System.out.println("All the elements are removed");
        }

    }
}
