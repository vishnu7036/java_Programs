package ProgrammReworkJuly19_2025;

public class FetchDuplicateStringAndCount {
    public static void main(String[] args){
        String s = "vishnuPavann";
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.length; j++){
                if(ch[i] == ch[j]){
                    count ++;
                    System.out.println(ch[i]);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
