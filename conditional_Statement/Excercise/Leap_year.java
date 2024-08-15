/*
 * Leap Year -  ( divisible by 4 || divisible by 400 &&  not divisible by 100 ) 
 */
package conditional_Statement.Excercise;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the Year : ");
	 int year = sc.nextInt();
	 if(year % 4 == 0)
	 {
	  if(year % 100 == 0)
	  {
	   if(year % 400 == 0)
		 System.out.println(year + " is a Leap Year");
	   else
		 System.out.println(year + " is not a Leap year");
	  }
	  else
	   System.out.println(year + " is a Leap Year");
	 }
	 else
	  System.out.println(year + " is not a Leap Year");
	sc.close();
	}
}
