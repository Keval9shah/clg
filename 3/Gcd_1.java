import java.util.Scanner;
public class Gcd_1 {
    public static void main(String[] args) {
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a = s.nextInt();
        System.out.println("Enter 2nd no.");
        int b = s.nextInt();
        Gcd_1 m = new Gcd_1();
        int z = m.gcd(a,b);
        System.out.println("GCD of "+a+" & "+b+" is : "+z);
        s.close();
    }
    int gcd(int a,int b){
        int i = 2,gcd=1;
        while(i<=a && i<=b){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
