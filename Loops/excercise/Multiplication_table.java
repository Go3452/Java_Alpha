/*
 * This program print the Multiplication Table of Number entered by user
 */
package Loops.excercise;
import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Multiplication Table : ");
		for(int i=1;i<=10;i++)
		 System.out.println(n + " * " + i + " = " + (n*i));
		sc.close();
	}

}
