/*
 * Type promotion in Expressions ->
 *      - Java automatically promotes byte , short or char operand to int when evaluating an expression
 *      - If one operand is long , float or double the whole expression is promoted to long dloat or double respectively; 
 *      //wrong
 *       byte b = 5;
 *       b=b*2;
 *       
 *      //right
 *      byte b = 5;
 *      b = (byte)(b*2);
 */
package variable;

public class Type_promotion {

	public static void main(String[] args) {
		char a = 'a';
		char b = 'b';
		//char c = b-a;
		System.out.println((int)b);
		System.out.println((int)a);
		System.out.println(b-a);
		System.out.println(a);
		
		short s = 5;
		byte B = 25;
		char c = 'c';
		// byte bt = a+b+c;
		byte bt = (byte)(s+B+c);
		System.out.println(bt);
		
		int ab=10;
		float bc = 20.25f;
		long cd = 25;
		double d = 30;
		//int ans = a+b+c+d;
		double ans = ab+bc+cd+d;
		System.out.println(ans);
	}

}
