package rufLogics;

public class Demo6 {
    public static void main(String[] args) {
        String ss = "My 35 name is 35 vishnu";
        String num ="";
        char[] ch = ss.toCharArray();
        for(char c : ch){
            if(Character.isDigit(c)){
                num = num +c;
            }
        }
        System.out.println(num);
    }
}
