package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetex {
public static void main (String args[]){
    LinkedHashSet<Integer> lk=new LinkedHashSet<Integer>();
    lk.add(10);
    lk.add(20);
    System.out.println(lk);

    LinkedHashSet<String> lkh=new LinkedHashSet<String>();
    lkh.add("Gauri");
    lkh.add("Sadashiv");
    lkh.add("Hiremath");
    System.out.println(lkh);

    Iterator<String > ltr= lkh.iterator();
    while (ltr.hasNext()){
        System.out.println(ltr.next());
    }
}
}
