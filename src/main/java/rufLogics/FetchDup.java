package rufLogics;

public class FetchDup {
    public static void main(String[] args) {
        String s = "vishnuvvss";
        char[] ch = s.toCharArray();
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length() - 1; j++) {
                if ( ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                   break;
                }

            }

        }
    }
}
