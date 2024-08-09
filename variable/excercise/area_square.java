package variable.excercise;
import java.util.Scanner;
public class area_square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side : ");
		int s = sc.nextInt();
		System.out.println("Area of square : " + s*s);
		sc.close();
	}

}
