package variable;
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		int r = sc.nextInt();
		double area = (double)22/7*r*r;
		System.out.println("Area of circle is " + area);
		sc.close();
	}

}
