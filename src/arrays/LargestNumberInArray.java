package arrays;

// Program to find largest number in the given array

public class LargestNumberInArray {

    public static void main(String[] args){
        int[] a = {5,7,12,16,3};
        int largestNumber = a[0];

        for(int i=1; i<a.length-1; i++) {
            if(largestNumber < a[i]) {
                largestNumber = a[i];
            }
        }
        System.out.println("Largest number is "+largestNumber);
    }
}
