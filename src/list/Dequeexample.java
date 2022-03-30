package list;
import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
public class Dequeexample {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>(10);
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        System.out.println(dq);

        dq.clear();

        dq.addFirst(5);
        dq.addFirst(9);
        System.out.println(dq);
        dq.addLast(2);
        dq.addLast(4);
        System.out.println(dq);
    }
}
