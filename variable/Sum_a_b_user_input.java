package variable;
import java.util.Scanner;
public class Sum_a_b_user_input {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the first number : ");
	 int a = sc.nextInt();
	 System.out.println("Enter the second number : ");
	 int b = sc.nextInt();
	 int sum=a+b;
	 System.out.println("Sum of " + a + " and " + b + " is " + sum);
	 sc.close();
	}

}
