package rufLogics;

public class Demo7 {
    public static void main(String[] args) {
        String ss = "this is vishnu pavan";
        String[] split = ss.split(" ");
        String longWord = "";
        int longNum = 0;
        for(String s : split){
            if(s.length()>longNum){
                longWord = s;
                longNum = s.length();
            }
        }
        System.out.println(longWord);
    }
}
