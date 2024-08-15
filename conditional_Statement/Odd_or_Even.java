/*
 * Odd or Even Number
 * Even - divisible by 2
 * odd - Not divisible by 2 
 */
package conditional_Statement;
import java.util.Scanner;
public class Odd_or_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		if(n%2 == 0)
		 System.out.println(n + " is Even");
		else
		 System.out.println(n + " is Odd");
	    sc.close();
	}

}
