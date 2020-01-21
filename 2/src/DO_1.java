import java.util.Scanner;

public class DO_1 {
    public static void main(String args[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        int a[],x,y;
        a = new int[3];
        Scanner no=new Scanner(System.in);
        for (x=0;x<3;x++) {
            System.out.printf("Enter no. #%d : ", x + 1);
            a[x] = no.nextInt();
        }
        if(a[0]<a[1])
        {
            y = a[0];
            a[0] = a[1];
            a[1] = y;
        }
        if(a[1]<a[2])
        {
            y = a[1];
            a[1] = a[2];
            a[2] = y;
        }
        if(a[0]<a[1])
        {
            y = a[0];
            a[0] = a[1];
            a[1] = y;
        }
        System.out.printf("%d || %d || %d",a[0],a[1],a[2]);
    }
}
