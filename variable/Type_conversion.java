/*
 * conversion happens when:
 *  1. type compatible
 *  2. destination type > source type
 *  
 *  byte->short->int->float->long->double
 *  ( Implicit Conversion )
 */
package variable;
import java.util.Scanner;
public class Type_conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f = sc.nextInt();
		System.out.println(f);
		// int b = sc.nextLong(); Error
	}

}
