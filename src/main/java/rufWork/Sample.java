package rufWork;

public class Sample {
    public static void main(String[] args) {
        String ss = "a3b2c4d1e3";
        char[] ch = ss.toCharArray();
        String letters = "";
        int num = 0;
        for (char c : ch) {
            if (Character.isAlphabetic(c)) {
                letters = letters + c;
                System.out.print(c);
            }
            if (Character.isLetter(c)) {
                num = num + c;
                System.out.print(c);
            }
        }
    }
}

