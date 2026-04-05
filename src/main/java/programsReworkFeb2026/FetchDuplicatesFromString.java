package programsReworkFeb2026;

public class FetchDuplicatesFromString {
    public static void main(String[] args){
        String orgString = "vishnuvvss";
        int count = 0;
        char[] ch = orgString.toLowerCase().toCharArray();
        for(int i=0; i<orgString.length(); i++){
            for(int j=i+1; j<orgString.length(); j++){
                if(ch[i] == ch[j]) {
                    count ++;
                    System.out.println("Duplicate String : " + ch[j]);
                }
            }
        }

    }
}
