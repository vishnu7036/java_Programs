package rufLogics;

public class FetchDuplicatesFromString {
    public static void main(String[] args) {
        String ss = "coconut";
        char[] ch = ss.toCharArray();
        for(int i=0; i<ss.length(); i++){
            for(int j=i+1; j<ss.length(); j++){
                if(ch[i]==ch[j]){
                    System.out.println("Duplicate String: "+ch[j]);
//                    break;
                }
            }
        }
    }
}
