package rufWork;
public class Sample {
    public static void main(String[] args) {
        String ss = "a3b2c4d1e3";
        char[] ch = ss.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (Character.isAlphabetic(c)) {
                int repeatCount = Character.getNumericValue(ch[i + 1]);
                for (int j = 0; j < repeatCount; j++) {
                    System.out.print(c);
                }
            }
        }
    }
}
