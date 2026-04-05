package ProgrammReworkJuly19_2025;

public class FetchNumberFromString {
    public static void main(String[] args) {
        String ss = "vidhn345nbfgrfe5k6456e3k4542eanrj3n46456rt";
        char[] ch = ss.toCharArray();
        for(char c :ch){
            if(Character.isDigit(c))
                System.out.print(c);
        }
        System.out.println();
        addition();
        add();
        mul();
    }

    public static void addition() {
        String ss = "vishnu 32 pavan 34 iodf 56 njdg 90";
        int num = 0;
        String[] split = ss.split(" ");
        for(String cc : split){
            try {
                int va = Integer.parseInt(cc);
                num = num + va;
            } catch(Exception ignored){

            }
        }
        System.out.println("Addition: "+num);
    }

    public static void add(){
        String ss = "vishnu 32 pavan 34 iodf 56 njdg 90";
        int num = 0;
        for(String word : ss.split(" ")){
            if(word.trim().matches("\\d+"))
                num += Integer.parseInt(word);
        }
        System.out.println("Number Fetches by using regex: "+num);
    }

    public static void mul(){
        String ss = "vishnu 32 pavan 34 iodf 56 njdg 90";
        int num = 1;
        for(String word : ss.split(" ")){
            if(word.trim().matches("\\d+")) num *= Integer.parseInt(word);
        }
        System.out.println("Multiplication: "+num);
    }




}
