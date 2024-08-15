/*
 * Ternary Operator Takes 3 Operands .
 * Syntax - Variable = condition ? statement1 : statement2 ;
 */
package conditional_Statement;

public class Ternary_Operator {

	public static void main(String[] args) {
		int number = 5;
		boolean b = number > 3 ? true : false;
		String ans = (number%2 == 0)? "Even" : "Odd" ;
		System.out.println(b);
		System.out.println(ans);
	}

}
