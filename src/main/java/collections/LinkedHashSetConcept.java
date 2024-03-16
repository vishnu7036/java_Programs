package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetConcept {
    // It won't allow duplicates, but it will follow order of insertion
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(50);
        lhs.add(20);
        lhs.add(90);
        lhs.add(10);
        lhs.add(30);
        lhs.add(40);
        lhs.add(20);
        lhs.add(null);
        System.out.println(lhs);
    }
}
