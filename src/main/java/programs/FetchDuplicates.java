package programs;

public class FetchDuplicates {
    public static void main(String[] args){
        String orgString = "vishnuvvss";
        char[] ch = orgString.toCharArray();
        int count = 0;
        for(int i=0; i<orgString.length(); i++){
            for(int j=i+1; j<orgString.length(); j++){
                if(ch[i] == ch[j]){
                    count++;
                    System.out.println("Duplicate characters: "+ch[j]);
//                    break;
                }
            }
        }
        System.out.println(count);
    }
}
