package programs;

public class ReverseString {
    public static void main(String[] args){
        String orgString = "vishnu";
        StringBuilder sb = new StringBuilder(orgString);

        System.out.println(sb.reverse());
//        String revString = "";
//        for(int i=orgString.length()-1; i>=0; i--)
//           revString += orgString.charAt(i);
//        System.out.println(revString);
    }
}
