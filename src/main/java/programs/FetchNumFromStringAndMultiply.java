package programs;

public class FetchNumFromStringAndMultiply {
    public static void main(String[] args) {
        String ss = "This 35 is vishnu 45 ";
        String trim = ss.trim();
        System.out.println(trim);
        int number = 0;
        String[] split =  ss.split(" ");
        for(String s : split){
            try {
                int num = Integer.parseInt(s);
                number = number + num;
            }catch (Exception e){

            }
        }
        System.out.println(number);
    }
}
