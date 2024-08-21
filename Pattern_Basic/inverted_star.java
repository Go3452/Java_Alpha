/*
 *       Inverted star Pattern -
 *       
 *       * * * *
 *       * * *
 *       * *
 *       *
 */
package Pattern_Basic;
import java.util.Scanner;
public class inverted_star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Lines : ");
		int n = sc.nextInt();
		System.out.println("*********Inverted star pattern*********");
		for(int i=0;i<n;i++)
		{
		 for(int j=0;j<n-i;j++)
		 {
		  System.out.print("* ");
		 }
		 System.out.println();
		}
		sc.close();
	}

}
