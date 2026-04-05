package rufWork;

public class Demo {
    public static void main(String[] args) {
        String ss = "this is vishnu pavan";
        int length = 0;
        String longWord = "";
        String[] split = ss.split(" ");
        for(String s : split){
            if(s.length() > length){
                length = s.length();
                longWord = s;
            }
        }
        System.out.println(longWord);
    }
}
