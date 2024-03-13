package programs;

public class PrintAlphabetForRepeatedTimes {
    public static void main(String[] args) {
        String ss = "d3f4g5h1k3";
        char[] ch = ss.toCharArray();
        for(int i=0; i<ch.length; i++){
            char c = ch[i];
            if(Character.isAlphabetic(c)){
                int num = Character.getNumericValue(ch[i+1]);
                for(int j=0; j<num; j++){
                    System.out.print(c);
                }
            }
        }
    }
}
