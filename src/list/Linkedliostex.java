package list;

import java.util.LinkedList;

public class Linkedliostex {
    public static void main(String args[]){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println(ll);

        ll.remove(0);
        System.out.println(ll);

        ll.add(0,10);
        System.out.println(ll);
    }
}
