package programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 16461;
        int revNum = 0;
        int orgNum = num;
        while(num!=0){
            int rem = num%10; // It i'll get the reminder
            revNum = revNum * 10+rem;
            num = num/10; // It i'll get Quotient
        }
        System.out.println(num);
        System.out.println(revNum);
        System.out.println(orgNum);
    }
}
