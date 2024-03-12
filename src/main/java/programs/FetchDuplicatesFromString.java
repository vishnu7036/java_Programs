package programs;

public class FetchDuplicatesFromString {
    public static void main(String[] args){
        String orgString = "coconut";
        char[] ch = orgString.toCharArray();
        for(int i=0; i<=orgString.length(); i++){
            for(int j=i+1; j<=orgString.length()-1; j++){
                if(ch[i] == ch[j])
                    System.out.println("Duplicate Strings: "+ch[j]);
            }
        }
    }
}
