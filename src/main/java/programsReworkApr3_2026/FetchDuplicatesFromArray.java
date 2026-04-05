package programsReworkApr3_2026;

public class FetchDuplicatesFromArray {
    public static void main(String[] args){
        int[] values = {10,20,30,40,20,10,10};
        int length = values.length;
        for(int i=0 ; i<=length; i++){
            for(int j=i+1; j<=length-1; j++){
                if(values[i] == values[j]) {
                    System.out.println(values[j]);
                    break;
                }
            }
        }
    }
}
