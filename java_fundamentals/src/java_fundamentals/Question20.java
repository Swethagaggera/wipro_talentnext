package java_fundamentals;
import java.util.Scanner;
public class Question20 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int original = num;
int reversed = 0;

while (num != 0) {
    reversed = reversed * 10 + num % 10;
    num = num / 10;
}

if (original == reversed) {
    System.out.println(original + " is a palindrome");
} else {
    System.out.println(original + " is not a palindrome");
        }
        
        sc.close();
    }
	

}