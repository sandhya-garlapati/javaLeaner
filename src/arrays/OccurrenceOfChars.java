package arrays;

public class OccurrenceOfChars {

    public static void main(String[] args) {
        String s = "hello my name is sandhya and am in Bangalore";
        s = s.replace(" ","");
        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i++) {
            int counter = 0;
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i]==ch[j]){
                    counter++;

                }
            }
            System.out.println("Occurence of "+ch[i]+" is "+counter);
        }
    }
}
