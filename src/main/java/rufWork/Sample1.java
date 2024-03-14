package rufWork;

public class Sample1 {
    public static void main(String[] args) {
        String ss = "16461";
        String rev = "";
        StringBuilder sb = new StringBuilder(ss);
        StringBuilder reverse = sb.reverse();

//        for(int i=ss.length()-1; i>=0; i--){
//            rev = rev + ss.charAt(i);
//        }
        if(ss.equals(rev))
            System.out.println("Given number is palindrome"+rev);

    }
}
