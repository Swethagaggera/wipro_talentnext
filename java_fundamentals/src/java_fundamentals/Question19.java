package java_fundamentals;
import java.util.Scanner;
public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = 3;  
int row = 1;

while (row <= n) {
    for (int col = 1; col <= row; col++) {
        System.out.print("* ");
		            }
		            System.out.println();
		            row++;
		            sc.close();
		            
		        }
		    }
	}