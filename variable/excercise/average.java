package variable.excercise;
import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float avg = (float)(a+b+c)/3;
		System.out.println(avg);
		sc.close();
	}

}
