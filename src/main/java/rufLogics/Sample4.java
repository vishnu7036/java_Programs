package rufLogics;

public class Sample4 {
    public static void main(String[] args) {
        String string = "vv34bebf36556b2bhdvshc5";
        char[] ch = string.toCharArray();
        for(char c : ch){
            if(Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}
