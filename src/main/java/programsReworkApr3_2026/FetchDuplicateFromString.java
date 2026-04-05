package programsReworkApr3_2026;

public class FetchDuplicateFromString {
    public static void main(String[] args) {
        String ss = "vishnuss";
        int length = ss.length();
        char[] ch = ss.toCharArray();
        int count = 0;
        for (int i = 0; i <= ss.length() - 1; i++)
            for (int j = i+1; j <= ss.length() - 1; j++)
                if (ch[i] == ch[j]) {
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
        System.out.println(count);
    }
}
