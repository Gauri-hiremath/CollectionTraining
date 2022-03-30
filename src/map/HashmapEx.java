package map;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Gauri",1);
        hm.put("Jayashree",20);
        System.out.println(hm);

        for (Map.Entry< String, Integer> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

    }
}
