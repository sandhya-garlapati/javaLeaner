package arrays;

//program to find smallest number in the given array

public class SmallestNumberInArray {

    public static void main(String[] args) {
        int[] a = {4,5,9,1,8};
        int smallestNumber = a[0];

        for(int i=1;i < a.length-1; i++) {
            if(smallestNumber>a[i]) {
                smallestNumber=a[i];
            }
        }
        System.out.println("smallest number is "+smallestNumber);
    }
}
