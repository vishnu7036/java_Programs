package rufLogics;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 16461;
        int rev = 0;
        int org = 0;
        while(num!=0){
            int rem = num%10;//reminder
            rev = rev*10+rem;
            org = rev;
            num = num/10;
        }
        if(rev == org){
            System.out.println("rev num : "+ rev);
            System.out.println("org num : "+ org);
        }

//        String nu = String.valueOf(num);
//        StringBuilder sb = new StringBuilder(nu);
//        StringBuilder rev = sb.reverse();
//        System.out.println(rev);
    }
}
