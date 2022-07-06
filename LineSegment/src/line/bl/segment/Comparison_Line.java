package line.bl.segment;
import java.util.Scanner;

public class Comparison_Line {
	public static void main(String[] args) {
		//double x1,y1,z1,x2,y2,z2;
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter the number1= ");
		int x1 = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the number2= ");
		int y1 = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter the number3= ");
		int z1 = input3.nextInt();
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter the number4= ");
		int x2 = input4.nextInt();
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter the number5= ");
		int y2 = input5.nextInt();
		Scanner input6 = new Scanner(System.in);
		System.out.println("Enter the number6= ");
		int z2 = input6.nextInt();
		
		if
			((x1/x2 == y1/y2)&& (y1/y2 == z1/z2) && (x1/y1 == z1/z2)){
	        System.out.println("The lines are equal");
		}

		else {
			System.out.println("the lines are not equal");
		}
	}

}
