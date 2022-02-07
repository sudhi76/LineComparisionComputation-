package linecomputation;

import java.util.Scanner;

public class LineComparisionComputation {
	public static int lineLengthCal() {
		int x1,y1,x2,y2;
		Scanner line = new Scanner(System.in);
		System.out.println("Enter the four co-ordinates of line"); 
		x1 = line.nextInt();
		y1 = line.nextInt();
		x2 = line.nextInt();
		y2 = line.nextInt();
		int lineLength = (int)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) );
		return lineLength;
		
	}
	public static void equalityCheck(int lineLength1 , int lineLength2 ) {
		if(lineLength1 == lineLength2 ) {
			System.out.println("Lines are Equal");
		}
		else {
			System.out.println("Lines are not Equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n"
				+ "Comparison Computation\r\n"
				+ "Program on Master Branch");
		int lineLength1 = lineLengthCal();
		int lineLength2 = lineLengthCal();
		System.out.println("The length of line 1 is: "+lineLength1);
		System.out.println("The length of line 2 is: "+lineLength2);
		equalityCheck(lineLength1,lineLength2);
		

	}

}