package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(50);
        l1.add(20);
        l1.add(90);
        l1.add(30);
        l1.add(40);
        System.out.println(l1);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);
        l2.add(500);
        l2.add(600);
        System.out.println(l2);
        l1.addAll(4,l2);
        System.out.println(l1);
        System.out.println("************************************************************************");

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(10);
        l3.add(50);
        l3.add(20);
        l3.add(90);
        l3.add(30);
        l3.add(40);
        System.out.println(l3);
        ArrayList<Integer> l4 = new ArrayList<>();
        l4.add(100);
        l4.add(200);
        l4.add(300);
        l4.add(400);
        l4.add(500);
        l4.add(600);
        System.out.println(l4);
        l3.addAll(4,l4);
        System.out.println(l3);
    }
}
