package Loops;
import java.util.Scanner;
public class reverse_print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Reverse print of number : ");
		while(n>0)
		{
		 System.out.print(n%10);
		 n/=10;
		}
		sc.close();
	}

}
