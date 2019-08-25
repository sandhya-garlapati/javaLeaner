package strings;

//program to count characters in a given string & to replace the last character with new character

public class CountCharsAndReplaceLastChar {

    public static void main (String[] args) {

        String str = "hello&world";

        int length = str.length();

        System.out.println("String lenghth is "+length);

        String str1 = str.replace('d','x');

        System .out.println(str1);

        // replacing the last character in a given string by using substring method

        String str2 = str.substring(0,str.length()-1)+'x';

        System.out.println(str2);

    }
}
