package loops;

// program to print the given pattern

public class PyramidPattern {

    public static void main(String[] args) {

        for(int i=1; i <= 6; i++) {
            for(int j=5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k <= i; k++) {
                int l = 8;
                System.out.print(" "+l);
            }
            System.out.println();
        }
    }
}
