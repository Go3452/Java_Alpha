/*
 * Income Tax Calculator -
 *  income - 5L <= = Tax - 0%
 *  income - 10L <= = Tax - 10%
 *  income - 15L <= = Tax - 20%
 *  income -  > 15L = Tax - 30%
 *  
 */
package conditional_Statement;
import java.util.Scanner;
public class Income_Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Income in Lakhs : ");
		int income = sc.nextInt();
		float Tax = 0.0f;
		if(income <= 5)
		 Tax = 0.0f;
		else if(income <= 10)
		 Tax = income * 0.1f;
		else if(income <= 15)
		 Tax = income * 0.2f;
		else 
		 Tax = income * 0.3f;
		System.out.println("Tax on income is " + Tax + " Lakhs");
		sc.close();
	}

}
