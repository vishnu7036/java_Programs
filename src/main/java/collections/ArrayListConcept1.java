package collections;

import java.util.ArrayList;
import java.util.Optional;

public class ArrayListConcept1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("vishnu");
        al.add(20.06);
        al.add('D');
        System.out.println("Original List: "+al);
        al.add(1,"Pavan");
        System.out.println("Added string on index1: "+al);
        al.remove(0);
        System.out.println("Removed the index 0 value: "+al);
        al.removeAll(al);
        System.out.println("Removed all the strings from ArrayList: "+al);
    }
}
