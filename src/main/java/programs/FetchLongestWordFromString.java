package programs;

public class FetchLongestWordFromString {
    public static void main(String[] args) {
        String ss = "My harshal name is";
        String lngWord = "";
        int maxLength=0;
        String[] words = ss.split(" ");
        for(String word: words){
            if(word.length()> maxLength){
                maxLength = word.length();
                lngWord = word;
            }
        }
        System.out.println(lngWord);
    }
}
