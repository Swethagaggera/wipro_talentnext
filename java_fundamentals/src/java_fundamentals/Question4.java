package java_fundamentals;
import java.util.*;
public class Question4{
	public static void main(String[] args) {
		System.out.println("Enter num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0){
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();
	}

}
