/*
 * Check age group - 
 *   if age > 19 - Adult
 *   if age >= 13 && age <=19 - Teenager
 *   if age < 13 - Child
 */
package conditional_Statement;
import java.util.Scanner;
public class Age_check {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the Age : ");
	  int age = sc.nextInt();
	  if(age > 19)
		System.out.println("Adult");
	  else if(age >= 13 && age <= 19)
		System.out.println("Teenager");
	  else
		System.out.println("Child");
	  sc.close();
	}

}
