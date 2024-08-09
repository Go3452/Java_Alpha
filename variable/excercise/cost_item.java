package variable.excercise;
import java.util.Scanner;
public class cost_item {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the price of pen : ");
	 float pen = sc.nextFloat();
	 System.out.print("Enter the price of pencil : ");
	 float pencil = sc.nextFloat();
	 System.out.print("Enter the price of scale : ");
	 float scale = sc.nextFloat();
	 System.out.println("The total cost of item is " + (pen+pencil+scale));
	 System.out.println("The total cost of item with 18% GST is " + (pen+pencil+scale)*118/100);
	 sc.close();
	}

}
