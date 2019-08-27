package loops;

// Program to reverse the given string

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello welcome to bangalore";

        for(int i = str.length()-1; i >= 0; i--) {
           System.out.print(str.charAt(i));
        }

    }
}
