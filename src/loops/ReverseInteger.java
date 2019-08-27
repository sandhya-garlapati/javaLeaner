package loops;

// program to reverse the given integer

public class ReverseInteger {

    public static void main(String[] args){
        int num=23344, rem, rev=0;

        while(num!=0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
