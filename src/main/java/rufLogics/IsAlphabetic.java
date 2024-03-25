package rufLogics;

public class IsAlphabetic {
    public static void main(String[] args) {
        String ss = "this 34 hg 2324 err";
        String [] split = ss.split(" ");
        int number = 0;
        for(String s : split){
            try{
                int num =Integer.parseInt(s);
                number = number+num;
            }catch(Exception e){

            }
        }
        System.out.println(number);
    }
}
