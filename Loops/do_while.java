/*
 * do{
 *   //statement
 *   }while(condition);
 *   *** Executed Atleast once ***
 */
package Loops;
public class do_while {
	public static void main(String[] args) {
		int counter = 1;
		do {
			System.out.println("Hello World");
			counter++;
		}while(counter <= 10);
	}

}
