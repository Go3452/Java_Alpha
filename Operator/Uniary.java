/*
 * Increment Operator - [ ++ ] 
 * Decrement operator - [ -- ]
 * 
 * Pre - value first changes then it used
 * post - value first used then it changes
 */
package Operator;

public class Uniary {
	public static void main(String[] args) {
	  //Pre-Increment
	  int a=10;
	  int b=++a;
	  System.out.println("Pre-Increment : a = " + a + " , b = " + b);
	  
	//Post-Increment
	  int c=10;
	  int d=c++;
	  System.out.println("Post-Increment : a = " + c + " , b = " + d);
	  
	//Pre-decrement
	  int e=10;
	  int f=--e;
	  System.out.println("Pre-Decrement : a = " + e + " , b = " + f);
	  
	//Post-decrement
	  int g=10;
	  int h=g--;
	  System.out.println("Pre-Increment : a = " + g + " , b = " + h);
	}

}
