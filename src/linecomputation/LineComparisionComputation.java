package linecomputation;

import java.util.Scanner;

public class LineComparisionComputation {
	public static int calLineLength() {
		int x1,x2,y1,y2;
		Scanner length = new Scanner(System.in);
		System.out.println("Enter the co-ordinates of line");
		x1 = length.nextInt();
		x2 = length.nextInt();
		y1 = length.nextInt();
		y2 = length.nextInt();
		int lineLength = (int)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) );
		return lineLength;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line\r\n"
				+ "Comparison Computation\r\n"
				+ "Program on Master Branch");
		int lineLength = calLineLength();
		System.out.println("The length of line is:" + lineLength);
	}

}
