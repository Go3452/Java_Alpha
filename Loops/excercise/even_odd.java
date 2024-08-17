/*
 * Program that prints sum of even and odd numbers
 */
package Loops.excercise;
import java.util.Scanner;
public class even_odd {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the count of numbers : ");
	 int n = sc.nextInt();
	 System.out.println("Enter the number : ");
	 int evesum=0,oddsum=0;
	 for(int i=0;i<n;i++)
	 {
	  int num=sc.nextInt();
	  if(num%2==0)
		  evesum+=num;
	  else
		  oddsum+=num;
	 }
	 System.out.println("Sum of Even Numbers : " + evesum);
	 System.out.println("Sum of Odd Numbers : " + oddsum);
	 sc.close();
	}

}
