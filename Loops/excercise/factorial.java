/*
 * This program print the factorial of the number entered by user.
 * factorial(n) = n*(n-1)*(n-2)*...3*2*1
 */
package Loops.excercise;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number : ");
		 int n = sc.nextInt();
		 long a=1;
		 for(int i=2;i<=n;i++)
		  a*=i;
		 System.out.println("Factorial : " + a);
		 sc.close();
	}

}
