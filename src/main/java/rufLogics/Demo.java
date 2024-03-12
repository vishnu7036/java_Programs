package rufLogics;

public class Demo {
    public static void main(String[] args) {
        String ss = "My name is harshal";
        String longWord = "";
        int wordLength = 0;
        String [] words=ss.split(" ");
        for(String word :words ){
            if(word.length()>wordLength){
                wordLength = word.length();
                longWord = word;
            }
        }
        System.out.println(longWord);
    }
}
