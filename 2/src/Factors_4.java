import java.util.Scanner;

public class Factors_4 {
    public static void main(String a[]){
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        int x,i;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a no.");
        x=n.nextInt();
        if(x==0){
            System.out.println("??");
        }
        else if(x==1){
            System.out.println("1");
        }
        else {
            for (i=2;i<=x;i++){
                if(x%i==0){
                    if(x==1){
                        break;
                    }
                    do{
                        x=x/i;
                        if(x==1){
                            System.out.print(i);
                        }
                        else{
                            System.out.print(i+",");
                        }
                    }while(x%i==0);
                }
            }
        }
    }
}
