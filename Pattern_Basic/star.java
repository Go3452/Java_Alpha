/*
 *    star pattern -
 *    
 *      * 
 *      * *
 *      * * *
 *      * * * *
 */
package Pattern_Basic;
import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Lines : ");
		int n = sc.nextInt();
		System.out.println("\n********Star Pattern********");
		for(int i=0;i<n;i++)
		{
		 for(int j=0;j<=i;j++)
		 {
		  System.out.print("* ");
		 }
		 System.out.println();
		}
		sc.close();
	}

}
