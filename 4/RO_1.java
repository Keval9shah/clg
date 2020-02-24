import java.util.Random;

class RO_1{
    public static void main(String args[]) {
        Random x=new Random(1000);
        int y;
        for(int i=0;i<100;i++){
            y=x.nextInt(49);
            System.out.println(y);
        }       
    }
}