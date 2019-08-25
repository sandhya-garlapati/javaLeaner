package strings;

// program to find index of vowels in a given string

public class IndexOfVowels {

    public static void main (String[] args) {

         String str = "hello world";
         int str1 = str.indexOf('e');
         int str2 = str.indexOf('o');
         int str3 = str.indexOf('o',6);
         System.out.println("Given string contains e at index "+str1);
         System.out.println("Given string contains o at index "+str2);
         System.out.println("Given string contains o at index "+str3);
    }
}
