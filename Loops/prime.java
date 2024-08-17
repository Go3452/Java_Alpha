/*
 * Number divisible by itself and 1 only are Prime Numbers.
 */
package Loops;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
		 if(n%i==0)
		 {
		  flag=1;
		  break;
		 }
		}
		if(flag==1)
		 System.out.println(n + " is not a Prime Number");
		else
		 System.out.println(n + " is Prime Number");
		sc.close();
	}

}
