package oops_inheritance;
import java.util.Scanner;

		
	class Box {
		double width;
		double height;
		double depth;
		Box (double w, double h, double d) {
			width = w;
			height = h;
			depth = d;
		}
		double getVolume() {
	        return width * height * depth;
	    }
	}

	public class Question1 {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        Box myBox = new Box(5.0, 3.0, 2.0);

	        
	        double volume = myBox.getVolume();
	        System.out.println("The volume of the box is: " + volume);
	        sc.close();
	    }
	
			
		}


