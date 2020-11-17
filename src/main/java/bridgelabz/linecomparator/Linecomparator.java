package bridgelabz.linecomparator;

import java.util.Scanner;

public class Linecomparator {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter Line 1 points");
		double Line1 = LengthofLine();
		System.out.println("Line1 = " + Line1);
	}

	private static double LengthofLine() 
	{
		Scanner sc = new Scanner(System.in);
		int x1,x2,y1,y2;
		System.out.println("Enter the values x1,x2,y1,y2");
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("x1 = " + x1 + "\nx2 = " + x2 + "\ny1 = " + y1 + "\ny2 = " + y2);
		double lenOfLine =Math.sqrt((x2 - x1) * (x2 - x1) + (y2- y1) * (y2 - y1));
		return lenOfLine;
	}
}