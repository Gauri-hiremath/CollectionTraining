package set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {
    public static void main(String args[]){

        HashSet<String> h=new HashSet<String>();
        h.add("Gauri");
        h.add("Sadashiv");
        h.add("Hiremath");
        System.out.println(h);

        Iterator<String> itr=h.iterator();
        while (itr.hasNext());
        System.out.println(itr.next());
    }
}
