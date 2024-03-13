package rufLogics;

public class Demo5 {
    public static void main(String[] args) {
        String ss = "My 35 name is 35 vishnu";
        int num = 0;
        String[] split = ss.split(" ");
        for(String s : split){
            try {
                int number = Integer.parseInt(s);
                num = num+number;
            }catch (Exception e){

            }
        }
        System.out.println(num);
    }
}
