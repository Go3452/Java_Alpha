package variable;
import java.util.Scanner;
public class product_a_b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		int prod = a*b;
		System.out.println("Product of " + a + " and " + b + " is " + prod);
		sc.close();
	}

}
