/*
 * Program to print Week days According to number using Switch
 */
package conditional_Statement.Excercise;
import java.util.Scanner;
public class Weekdays {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the day number : ");
     int n = sc.nextInt();
     switch(n)
     {
     case 1:System.out.println("Monday");break;
     case 2:System.out.println("Tuesday");break;
     case 3:System.out.println("Wednesday");break;
     case 4:System.out.println("thursday");break;
     case 5:System.out.println("Friday");break;
     case 6:System.out.println("Saturday");break;
     case 7:System.out.println("Sunday");break;
     default:System.out.println("Invalid input");
     }
     sc.close();
	}

}
