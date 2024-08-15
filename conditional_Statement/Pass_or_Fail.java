/*
 * Find Whether a student is pass or fail
 *  marks >= 33 - Pass
 *  marks < 33 - fail
 */
package conditional_Statement;
import java.util.Scanner;
public class Pass_or_Fail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of Student : ");
		int marks = sc.nextInt();
		if(marks >= 33)
		 System.out.println("Student is Pass");
		else
		 System.out.println("Student is Fail");
		sc.close();
	}

}
