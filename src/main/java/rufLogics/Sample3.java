package rufLogics;

public class Sample3 {
    public static void main(String[] args) {
        String orgString = "coconut";
        char[] ch = orgString.toCharArray();
        for(int i=0; i<orgString.length(); i++){
            for(int j= i+1; j<orgString.length(); j++){
                if(ch[i]==ch[j]){
                    System.out.println("Duplicate String: "+ ch[j]);
                }
            }
            System.out.println("unique String: "+ch[i]);
        }
    }
}
