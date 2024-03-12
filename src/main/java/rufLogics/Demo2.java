package rufLogics;

public class Demo2 {
    public static void main(String[] args) {
        String ss = "vishnuvvss";
        String orgString = "";
        String dupString = "";
        char[] ch = ss.toCharArray();

        for (int i = 0; i < ss.length(); i++) {
            boolean isDuplicate = false;

            // Check if the current character is a duplicate
            for (int j = i + 1; j < ss.length(); j++) {
                if (ch[i] == ch[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to orgString
            if (!isDuplicate) {
                orgString = orgString + ch[i];
            } else {
                // If a duplicate, add it to dupString
                dupString = dupString + ch[i];
            }
        }

        System.out.println("Original String: " + orgString);
        System.out.println("Duplicate Strings: " + dupString);
    }
}
