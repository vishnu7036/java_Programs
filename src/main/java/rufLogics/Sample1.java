package rufLogics;

public class Sample1 {
    public static void main(String[] args) {
        String ss = "My name is vishnu";
        String lngWord = "";
        int wordLength = 0;
        String[] words = ss.split(" ");
        for(String word : words){
            if(word.length()>wordLength){
                lngWord = word;
                wordLength = word.length();
            }
        }
        System.out.println(lngWord);
    }
}
