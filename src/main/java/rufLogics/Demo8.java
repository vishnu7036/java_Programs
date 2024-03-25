package rufLogics;

public class Demo8 {
    public static void main(String[] args) {
        String ss = "a3b2g4h5";
        char[] ch = ss.toCharArray();
        for(int i=0; i<ss.length()-1; i++){
            char c =ch[i];
            if(Character.isAlphabetic(c)){
                int num = Character.getNumericValue(ch[i+1]);
                for(int j=0; j<num; j++){
                    System.out.print(c);
                }
            }
        }
    }
}
