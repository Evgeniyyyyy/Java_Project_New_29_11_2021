package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        Collection<String> collection1 = new ArrayList<>();
    //    Collection<String> collection = list;
     //   collection = list;

        java.lang.Iterable<String> iterable = collection1;
     //   collection.add("collection");
        list.add("list");
        list.add("listOne");
        collection1.add("colOne");
        System.out.println(list);
        System.out.println(collection1);
        collection1 = list;
        System.out.println(collection1);



      //   Iterable<String> iterable = list;


    }
}
