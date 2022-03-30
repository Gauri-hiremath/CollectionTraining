package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex {
    public static void main (String args[]){
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Gauri");
        ts.add("Sadashiv");
        ts.add("Hiremath");
        ts.add("Is");
        ts.add("Very helpful");
        System.out.println(ts);

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    }

