package rufLogics;

public class Demo3 {
    public static void main(String[] args) {
        String orgString = "This is vishnu chowdary";
        String longWord = "";
        int wordLength = 0;
//        StringBuilder sb = new StringBuilder();
        String[] ss = orgString.split(" ");
        for(String s : ss){
            if(s.length()>wordLength){
                longWord = s;
                wordLength = s.length();
            }
        }
        System.out.println(longWord);

    }
}
