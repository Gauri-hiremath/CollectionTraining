package list;

import java.util.Vector;

public class Vectorclass {
    public static void main (String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Gauri");
        v.add("Pavan");
        System.out.println(v);

        v.remove(0);
        System.out.println(v);

        v.add(0,"Hiremath");
        v.add(1,"Tuptewar");
        System.out.println("Vectorlist : " +v);
    }
}
