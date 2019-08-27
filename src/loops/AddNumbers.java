package loops;

//program to add all numbers between 1 and 100 and print the result

public class AddNumbers {

    public static void main(String[] args) {
        int total=0;

        for(int num=1; num <= 100; num++){
            total=total+num;
        }
        System.out.println("total is "+total);
    }
}
