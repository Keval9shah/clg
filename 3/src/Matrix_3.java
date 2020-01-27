import java.util.Random;

public class Matrix_3 {
    public static void main(String[] args) {
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        Random g = new Random();
        int[][] x = new int [6][7];
        int i;
        int j;
        int k=0;
        int l=0;
        for(i=0;i<6;i++){
            int y=0;
            for(j=0;j<6;j++){
                x[i][j]=g.nextInt(2);
                System.out.print(x[i][j]+"   ");
                if(x[i][j] == 1){
                    y++;
                }
            }
            x[i][6]=y;
            System.out.print("   : "+y);
            if(y%2==1){
                System.out.print("  Odd");
            }
            else{
                System.out.print("  Even");
            }
            System.out.print("\n");
        }
    }
}
