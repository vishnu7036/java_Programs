package ProgrammReworkJuly19_2025;

public class FetchLargestWordFromString {
    public static void main(String[] args) {
        String s = "My Name is Vishnu Pavan";
        String[] ss = s.split(" ");
        String longestWord = "";
        int n = 0;
        for(String lon : ss){
            int num = lon.trim().length();
            if(n<num) {
                n = num;
                longestWord = lon;
            }
        }
        System.out.println(longestWord);
    }
}
