package rufLogics;

public class FetchLargeWordFromString {
    public static void main(String[] args) {
        String ss = "This is vishnu pavan";
        String longWord = "";
        int longWordNum = 0;
        String[] split = ss.split(" ");
        for(String s : split){
            if(s.length()>longWordNum){
                longWord = s;
                longWordNum = s.length();
            }
        }
        System.out.println(longWord);
    }
}
