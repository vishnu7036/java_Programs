package programsReworkApr3_2026;

public class FetchLongestWordFromString {
    public static void main(String[] args) {
        String ss = "My name is vishnu pavan";
        String longWord = "";
        int wordLength = 0;
        String[] words = ss.split(" ");
        for(String word : words){
            if(word.length()> wordLength){
                wordLength++;
            }
        }
        System.out.println(wordLength);

    }
}
