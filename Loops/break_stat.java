/*
 * Break is use to exit the Loop or Switch statement
 */
package Loops;

public class break_stat {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
		 if(i==3)
		 {
		  break;
		 }
		 System.out.println(i);
		}
		System.out.println("I am out of the loop");
	}

}
