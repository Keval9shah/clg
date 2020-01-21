public class XY_2 {
    public static void main(String args[]) {
        System.out.println("Keval Shah\nEnrollment no : 180410107105");
        float x,y,a=3.4f,b=50.2f,c=2.1f,d=0.55f,e=44.5f,f=5.9f;
        System.out.print("Solution for following Equations\n1) 3.4x+50.2y=44.5\n2) 2.1x+0.55y=5.9\n");
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.print("\nx = "+x+"   y = "+y);
    }
}
