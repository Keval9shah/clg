import java.util.Scanner;

public class Letter_2 {
    public static void main(String args[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        char x;
        System.out.println("Enter a letter");
        Scanner le=new Scanner(System.in);
        x=le.next().charAt(0);
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u' )
        {
            System.out.println(x+" is a vowel");
        }
        else{
            System.out.println(x+" is a consonant");
        }
    }
}
