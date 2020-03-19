import java.util.Scanner;

/**
 * FR_5
 */
public class FR_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        String s1 = sc.nextLine();
        String[] array = new String[2];
        int a, b;
        if (s1.contains(".")) {
            array = s1.split("\\.", 2);
            int el=0;
            a=array[1].length()-1;
            String s2="";
            for(int i=a;i>=0;i--){
                if(array[1].charAt(i)=='0'&&el==0){
                    continue;
                }
                else{
                    s2="0"+s2;
                    el=1;
                }
            }
            s2="1"+s2;
            a = Integer.parseInt(array[0] + array[1]);
            b = Integer.parseInt(s2);
            int i = 2, gcd = 1;
            while (i <= a && i <= b) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
                i++;
            }
            a = a / gcd;
            b = b / gcd;
            System.out.println(a + "/" + b);
        } else {
            try {
                a = Integer.parseInt(s1);
                System.out.println(a + "/1");
            } catch (Exception e) {
                System.out.println("It's not a number!!");
            }
        }
        sc.close();
    }
}