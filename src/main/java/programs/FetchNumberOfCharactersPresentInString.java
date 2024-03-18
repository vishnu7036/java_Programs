package programs;
public class FetchNumberOfCharactersPresentInString {
    public static void main(String[] args) {
        String ss = "vishnuv";
        char[] ch = ss.toCharArray();
        for(int i=0; i<ss.length(); i++){
            char a =ch[i];
            int count = 0;
            boolean processed = false; // Flag to track whether character has been processed
            for(int j= 0; j<ss.length(); j++){
                if(ch[i]==ch[j]){
                    count ++;
                    if(i > 0 && ch[i] == ch[i-1]) // Check if current character has already been processed
                        processed = true;
                }
            }
            if(!processed) // Print count only if character has not been processed yet
                System.out.println(a+" : "+ count);
        }
    }
}

