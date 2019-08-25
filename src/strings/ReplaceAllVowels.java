package strings;

// program to replace all vowels in a given string with given replacement

public class ReplaceAllVowels {

    public static void main(String[] args) {

        String str = "I am new to bangalore";

        String str1 = str.replace('a','x');

        String str2 = str1.replace('e','x');

        String str3 = str2.replace('I','x');

        String str4 = str3.replace('o', 'x');

        System.out.println(str4);

        // by using replaceAll method

        String replace = str.replaceAll("[IaeoAEiOuU]","x");

        System.out.println(replace);
    }
}



