package programs;

public class ReverseIndividualStringFromWholeString {
    public static void main(String[] args) {
        String ss = "This is vishnu pavan";
        String revString = "";
        String[] splitedString = ss.split(" ");
        for(String s : splitedString){
            for(int i=s.length()-1; i>=0; i--){
                revString = revString + s.charAt(i);
            }
            revString = revString+" ";
        }
        System.err.println(revString);
    }
}
