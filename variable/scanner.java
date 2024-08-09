/*
 * String(without space) - next()
 * String(with space) - nextLine()
 * integer - nextInt()
 * float - nextFloat()
 * long - nextLong()
 * short - nextShort()
 * byte - nextByte()
 * double - nextDouble()
 */
package variable;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		System.out.println(b);
		sc.close();
	}

}
