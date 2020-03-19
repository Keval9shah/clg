import java.util.Scanner;

class Cal_2 {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("Enter Expression");
        int l=0;
        String ex=y.nextLine();
        String[] arr=new String[2];
        
        if(ex.contains("+")){
            arr=ex.split("\\+",2);
            arr[0]=arr[0].trim();
            arr[1]=arr[1].trim();
            l=Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
        }
        else if(ex.contains("-")){
            arr=ex.split("\\-",2);
            arr[0]=arr[0].trim();
            arr[1]=arr[1].trim();
            l=Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
        }
        else if(ex.contains("*")){
            arr=ex.split("\\*",2);
            arr[0]=arr[0].trim();
            arr[1]=arr[1].trim();
            l=Integer.parseInt(arr[0])*Integer.parseInt(arr[1]);
        }
        else if(ex.contains("/")){
            arr=ex.split("\\/",2);
            arr[0]=arr[0].trim();
            arr[1]=arr[1].trim();
            l=Integer.parseInt(arr[0])/Integer.parseInt(arr[1]);
        }
        System.out.println(l);
        y.close();
    }
}