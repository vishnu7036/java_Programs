package collections;

import java.util.HashSet;

public class HashSetConcept {
    /*  It won't follow order of insertion
        It won't allow duplicates
     */
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(50);
        hs.add(20);
        hs.add(90);
        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(20);
        hs.add(null);
        System.out.println(hs);
    }
}
