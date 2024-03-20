package rufLogics;

public class ReverseString {
    public static void main(String[] args) {
        String ss = "vishnu";
        String rev = "";
        for(int i=ss.length()-1; i>=0; i--){
            rev = rev + ss.charAt(i);
        }
        System.out.println("By using logic I reverse the string  : "+rev);

        StringBuilder sb = new StringBuilder(ss);
        StringBuilder reverse = sb.reverse();
        System.out.println("By using StringBuilder class I reverse the string  : "+rev);
    }
}
