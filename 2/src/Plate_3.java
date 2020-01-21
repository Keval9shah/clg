import java.util.Random;

public class Plate_3 {
    public static void main(String args[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        Random l=new Random();
        int a[],i;
        char b[];
        a=new int[4];
        b=new char[3];
        for(i=0;i<4;i++) {
            a[i] = l.nextInt(10);
            if (i != 3) {
                b[i] = (char)(l.nextInt(26)+65);
            }
        }
        System.out.println(b[0]+" \b"+b[1]+" \b"+b[2]+" \b"+a[0]+" \b"+a[1]+" \b"+a[2]+" \b"+a[3]);
    }
}
