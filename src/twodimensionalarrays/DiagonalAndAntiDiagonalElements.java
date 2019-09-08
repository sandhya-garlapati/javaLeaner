package twodimensionalarrays;

//Program to print diagonal and anti diagonal elements of matrix

public class DiagonalAndAntiDiagonalElements {

    public static void main (String[] args) {
        int[][] a = {{1,6,8},{4,7,2},{9,3,5}};

        for(int i=0; i<a.length; i++){
            System.out.print(a[i][i]+" ");
        }
        System.out.println();

        for(int i=0; i<a.length; i++){
            System.out.print(a[a.length-i-1][i]+" ");
        }

    }
}
