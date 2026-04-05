package ProgrammReworkJuly19_2025;

public class Reverse {
    public static void main(String[] args) {
        String ss = "Ramu is a good boy";
        String noSpaces = ss.replace(" ", ""); // Remove all spaces
        String reversed = new StringBuilder(noSpaces).reverse().toString();
        System.out.println(reversed);
        String[] words = ss.split(" ");
        int index = 0;
        for(String word : words){
            int len = word.length();
            System.out.print(reversed.substring(index, index+len)+" ");
            index = index +len;
        }



//        String reversed = new StringBuilder(noSpaces).reverse().toString();
//
//        String[] words = ss.split(" ");
//        int index = 0;
//
//        for (String word : words) {
//            int len = word.length();
//            System.out.print(reversed.substring(index, index + len) + " ");
//            index += len;
//        }
    }
}

