/*
 * Reverse of a number is achieved with Modulus(%) operator.
 */
package Loops;
import java.util.Scanner;
public class reverse_number {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	 int rev=0;
	 int t = sc.nextInt();
	 while(t>0)
	 {
	  int r = t%10;
	  rev=rev*10+r;
	  t/=10;
	 }
	 System.out.println("Reverse of number : " + rev);
	 sc.close();
	}
}
