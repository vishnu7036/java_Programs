package programs;

import java.util.HashMap;

public class FetchRepeatedCharInString {
    public static void main(String[] args) {
        String ss = "programming";
        char[] ch = ss.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : ch){
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                    if(map.get(c)>1){
                        System.out.println(c+"="+map.get(c));
                    }
            }else{
                    map.put(c,1);
                }
        }

    }
}
