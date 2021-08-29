package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"one", "two"};
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));

        }
        System.out.println();

        // remove one element
        list.remove(0);

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        System.out.println("____________________________");

        ArrayList <String> list1 = new ArrayList<>();
        list1.add("test");
        list1.add("test1");
        list1.add("test");
        // такой цикл используется если не нужно проходить по индексам [i]
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        for (Integer int_: list2) {
            System.out.println(int_);
        }
        System.out.println("_______________________________");
        // Set хранит уникальные значения

        Set<String> var = new HashSet<>(list1);
        var.add("one");
        var.add("one");
        System.out.println(var);

        System.out.println("_______________________________");

        Map<String, Integer> arr_map = new HashMap<>();
        arr_map.put("one", 3);
        arr_map.put("two", 3);
        arr_map.put("one", 15);
        for (String key: arr_map.keySet()) {
            System.out.println("Show key: " + key);
        }
        System.out.println();
        for (Integer key: arr_map.values()) {
            System.out.println("Show value: " + key);
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry: arr_map.entrySet()) {
            System.out.println("Show value: " + entry.getKey());
            System.out.println("Show key: " + entry.getValue());
                }
        System.out.println();
        System.out.println("Show array: " + arr_map);
        System.out.println("_________________________________");

        //возможность добавлят в лист элементы
       // List<String> l = new ArrayList<>(List.of("one", "two"));

        // преобразование стринг коллекции в интеджер
      /*  List<Integer> Li = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(Li);*/
        // три основных интерфейса в коллекции List Set Map
               /* List хранит просто списки
                Set не повторяющиеся значения
                Map это пара ключ значение (не возможность повторять значения)*/

       // Generic - это возможность указывать тип во время исполнения
        



    }
}
