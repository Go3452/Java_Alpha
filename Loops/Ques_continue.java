/*
 * display all number entered by user except multiple of 10
 */
package Loops;
import java.util.Scanner;
public class Ques_continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter number : ");
			int n = sc.nextInt();
			if(n%10==0)
			{
			 continue;
			}
			System.out.println(n);
		}while(true);
	}

}
