package programsReworkApr3_2026;

public class ReverseString {
    public static void main(String[] args) {
        String s = "vishnu";
        String rev = "";
        int length = s.length() - 1;
        for (int i = length; i >= 0; i--)
            rev = rev + s.charAt(i);
        System.out.println(rev);

    }
}
