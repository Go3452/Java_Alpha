/*
 * Calculator - [ + , - , * , / , % ]
 */
package conditional_Statement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter Your Choice : ");
		char ch = sc.next().charAt(0);
		switch(ch)
		{
		case '*':System.out.println("Multiplication of " + num1  + " and " + num2 + " : "  + (num1*num2));break;
		case '+':System.out.println("Addition of " + num1  + " and " + num2 + " : "  + (num1+num2));break;
		case '-':System.out.println("Subtraction of " + num1  + " and " + num2 + " : "  + (num1-num2));break;
		case '/':System.out.println("Division of " + num1  + " and " + num2 + " : "  + (num1/num2));break;
		case '%':System.out.println("Modulus of " + num1  + " and " + num2 + " : "  + (num1%num2));break;
        default : System.out.println("Invalid Choice");
		}
		sc.close();
	}

}
