package TS_3;
import java.util.ArrayList;
import java.util.Date;

public class TS_3 {
	// Main method
	public static void main(String[] args) {
		// Create an array list of objects
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan());		
		o.add(new Date());		
		o.add(new String("String class"));	
        o.add(new Circle());	
        
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
}