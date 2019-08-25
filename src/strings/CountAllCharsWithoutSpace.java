package strings;

// program to count all characters in a given string without space

public class CountAllCharsWithoutSpace {

    public static void main (String[] args) {

        String str = "hell o am new to bangalore";

        String str1 = str.replace(" ","");

        System.out.println("String length is "+str1.length());

    }
}
