package Pattern_Basic;
import java.util.Scanner;
public class character_pattern {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number of rows : ");
	 int n = sc.nextInt();
	 char ch='A';
	 for(int i=0;i<n;i++)
	 {
	  if(ch=='Z'+1)
		 ch='A';
	  for(int j=0;j<=i;j++)
	  {
	   if(ch=='Z'+1)
		   ch='A';
	   System.out.print(ch);
	   ch++;
	  }
	  System.out.println();
	 }
	 sc.close();
	}

}
