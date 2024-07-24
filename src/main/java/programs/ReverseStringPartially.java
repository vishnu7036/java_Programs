package programs;

public class ReverseStringPartially {
    public static void main(String[] args) {
        String name = "vishnu pavan";
        String[] names = name.split(" ");
        String fn = names[0];
        String ln = names[1];
        String rev = "";
        for (int i = fn.length() - 1; i >= 0; i--) {
            rev = rev + fn.charAt(i);
        }
        String output = rev + " " + ln;
        System.out.println(output);
    }
}
