import java.util.Scanner;

public class Convert_3 {
    public static void main(String args[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        float x,y;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no. in meters");
        x=ob.nextFloat();
        y=3.281f*x;
        System.out.printf("%.2f meters = %.3f feet",x,y);
        ob.close();
    }
}
