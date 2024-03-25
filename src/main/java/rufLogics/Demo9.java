package rufLogics;

public class Demo9 {
    public static void main(String[] args) {
        String ss = "v2i3s4h3n5u3";
        for(int i=0; i<=ss.length()-1; i++){
            char ch = ss.charAt(i);
            if(Character.isAlphabetic(ch)){
                int num = Character.getNumericValue(ss.charAt(i+1));
                for(int j=0; j<num; j++){
                    System.out.print(ch);
                }
            }

        }
    }
}
