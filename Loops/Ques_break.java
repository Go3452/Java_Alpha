/*
 * Program in which user entered numbers untill number is multiple of 10
 */
package Loops;
import java.util.Scanner;
public class Ques_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		 System.out.print("Enter number : ");
		 int n = sc.nextInt();
		 if(n%10==0)
		  break;
		 System.out.println(n);
		}
		System.out.println("Number entered is Multiple of 10.\nLoop Ended!");
		sc.close();
	}

}
