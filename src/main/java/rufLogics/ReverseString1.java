package rufLogics;

public class ReverseString1 {
    public static void main(String[] args) {
        String ss = "vishnu";
        String rev = "";
        for(int i = ss.length()-1; i>=0; i--){
            rev += ss.charAt(i);
        }
        System.out.println(rev);
    }
}
