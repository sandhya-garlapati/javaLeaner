package strings;

// program to find substring of last 3 characters in a given string

public class SubstringOfLastThreeCharacters {

    public static void main(String[] args) {

        String str = "hello i am new to java";

        String substring = str.substring(19);

        System.out.println("substring of last 3 characters is "+substring);

        //If we pass the string during run time

        String substring1 = str.substring(str.length()-3);

        System.out.println("substring of last 3 characters is "+substring1);

    }
}
