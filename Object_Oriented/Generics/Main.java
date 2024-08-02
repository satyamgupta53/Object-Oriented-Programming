package Generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(2, 100);
        list.display();

        list.remove(2);
        list.remove();
        list.display();

        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is list empty: " + list.isEmpty());
        System.out.println(list.toString());

        System.out.println("--------------------------------------------");

        GenericArrayList<String> list2 = new GenericArrayList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("Java");
        list2.add("Programming");
        list2.add("Language");
        list2.display();

        list2.remove(2);
        list2.remove();
        list2.display();

        System.out.println("Element at index 2: " + list2.get(2));
        System.out.println("Size of the list: " + list2.size());
        System.out.println("Is list empty: " + list2.isEmpty());

        System.out.println("--------------------------------------------");

        GenericArrayList<Integer> list3 = new GenericArrayList<>(new Integer[] { 1, 2, 3, 4, 5 });
        list3.add(10);
        System.out.println(list3.toString());

        System.out.println("--------------------------------------------");

        WildcardExample<Integer> list4 = new WildcardExample<>();
        list4.display(List.of(1.0, 2.0, 3.0, 4.0, 5.0));
    }
}