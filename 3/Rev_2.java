import java.util.Scanner;

public class Rev_2 {
    public static void main(String[] args) {
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        Scanner s = new Scanner(System.in);
        int[] x = new int[10];
        for (int i=1;i<11;i++){
            System.out.println("Enter no #"+i);
            x[i-1] = s.nextInt();
        }
        Rev_2 m = new Rev_2();
        m.reverse(x);
        s.close();
    }
    void reverse(int[] a){
        int i,k;
        System.out.println("Normal order");
        for(i=0;i<10;i++){
            System.out.print(a[i]+" | ");
        }
        for(i=0;i<5;i++){
            k=a[i];
            a[i]=a[9-i];
            a[9-i]=k;
        }
        System.out.println("\nReversed order");
        for(i=0;i<10;i++){
            System.out.print(a[i]+" | ");
        }
    }
}
