package Loops;
import java.util.Scanner;
public class sum_of_n {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	 int num = sc.nextInt();
	 int counter=1,sum=0;
	 while(counter <= num)
	 {
	  sum+=counter;
	  counter++;
	 }
	 System.out.println("Sum of first " + num + " natural number : " + sum);
	 sc.close();
	}
}
