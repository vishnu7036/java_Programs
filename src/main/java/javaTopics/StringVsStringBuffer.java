package javaTopics;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        String s = "vishnu";
        String re = s.concat(" Pavan");
        String v = " pavan";
        System.out.println(s);
        System.out.println(re);
        System.out.println("Trimmed :"+v);
        System.out.println("Trimmed :"+v.trim());
    }
}
