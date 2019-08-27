package loops;

// Program to find if a given string us palindrome

public class Palindrome {

    public static void main(String[] args) {
        String original = "Malayalam";
        String reverse = "";

        for(int i = original.length()-1; i >= 0; i--){
            reverse = reverse+original.charAt(i);
        }
        if(original.equalsIgnoreCase(reverse)){
            System.out.println("given string is palindrome");
        }else {
            System.out.println("given string is not palindrome");
        }

    }
}
