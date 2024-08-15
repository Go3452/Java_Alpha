/*
 * If Temperature > 100 - fever
 * else - No fever
 */
package conditional_Statement.Excercise;
import java.util.Scanner;
public class Temperature_fever {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature : ");
		double temp = sc.nextDouble();
		if(temp > 100)
		 System.out.println("You have fever");
		else
		 System.out.println("You don't have fever");
		sc.close();
	}

}
