package variable;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines in Pattern : ");
		int n = sc.nextInt();
		System.out.println("Pattern : \n");
		for(int i=0;i<n;i++)
		{
		 for(int j=0;j<n-i;j++)
		  System.out.print("* ");
		 System.out.println();
		}
		sc.close();
	}

}
