/*
 * Greater of A , B and C
 */
package conditional_Statement;
import java.util.Scanner;
public class Greatest_Of_three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		System.out.print("Enter Third number : ");
		int c = sc.nextInt();
		System.out.println();
		if(a > b)
		{
	     if(a > c)
	      System.out.println("A is Greater than B and C");
	     else if(c > a)
	      System.out.println("C is Greater than A and B");
	     else
	      System.out.println("A and C are Equal and is Greater than B");
		}
		else if(b > a)
		{
		 if(b > c)
	      System.out.println("B is Greater than A and C");
	     else if(c > b)
		  System.out.println("C is Greater than A and B");
		 else
		  System.out.println("B and C are Equal and is Greater than A");
		}
		else
		{
		 if(a > c)
		  System.out.println("A and B are Equal and is Greater than C");
		 else if(c > a)
		  System.out.println("C is Greater than A and B");
		 else
		  System.out.println("A , B and C are Equal");
		}
		sc.close();
	}

}
