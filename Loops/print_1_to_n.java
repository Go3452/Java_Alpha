package Loops;
import java.util.Scanner;
public class print_1_to_n {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number : ");
		 int n = sc.nextInt();
		 System.out.println("Number from 1 to " + n + " : ");
		 for(int i=1;i<=n;i++)
		  System.out.print(i + " ");
		 sc.close();
	}

}
