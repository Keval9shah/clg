import java.util.Scanner;

public class BMI_4 {
    public static void main(String args[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        float w,h,b;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter your Weight in pounds");
        w=c.nextFloat();
        w=0.45359237f*w;
        System.out.println("Enter your Height in inches");
        h=c.nextFloat();
        h=0.0254f*h;
        b=w/(h*h);
        System.out.println("Your BMI index is  "+b);
        c.close();
    }
}
