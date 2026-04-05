package programs;

public class RevString {
    public static void main(String[] args){
        String name = "vishnupavan";
        int num = 4;
        String rev = "";
        for(int i=4; i>=1; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
        rev = rev+name.substring(5);
        System.out.println(rev);
    }
}
