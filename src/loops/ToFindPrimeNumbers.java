package loops;

//program to find all prime numbers between 1 and 100

public class ToFindPrimeNumbers {

    public static void main(String[] args){
        int n = 100;

        for(int i=2; i<n; i++){
            int k = 0;
            for(int j=2; j<i; j++) {
                if(i%j==0){
                    k=1;
                    break;
                }
            }
            if(k==0)
                System.out.print(" "+i);
        }
    }
}
