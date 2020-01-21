import java.util.Random;

public class Matrix_3 {
    public static void main(String[] args) {
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        Random g = new Random();
        int[][] x = new int [7][7];
        int i,j,k=0,l=0;
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                x[i][j]=g.nextInt(2);
                System.out.print(x[i][j]);
                if(j!=5){
                    System.out.print(" | ");
                }
            }
            System.out.print("\n");
        }
        for(i=0;i<6;i++){
            k=0;
            for(j=0;j<6;j++){
                if(x[i][j]==1){
                    k++;
                }
            }if(k%2!=0){x[i][6]=1;}
        }
        for(j=0;j<6;j++){
            l=0;
            for(i=0;i<6;i++){
                if(x[i][j]==1){
                    l++;
                }
            }if(l%2!=0){x[6][j]=1;}
        }
        System.out.println("Rows with odd 1's are:");
        for(i=0;i<6;i++){
            if(x[i][6]==1){
                System.out.print((i+1)+", ");
            }
        }
        System.out.println("\nColumns with odd 1's are:");
        for(i=0;i<6;i++) {
            if (x[6][i] == 1) {
                System.out.print((i+1)+", ");
            }
        }
    }
}
