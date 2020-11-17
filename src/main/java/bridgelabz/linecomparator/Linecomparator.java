package bridgelabz.linecomparator;

import java.util.Scanner;

public class Linecomparator {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter Line 1 points");
		double Line1 = LengthofLine();
		System.out.println("Enter Line 2 points");
		double Line2 = LengthofLine();
		System.out.println("Line1 = " + Line1 + "\nLine2 = " + Line2);
		compareTo(Line1,Line2);
	}

	private static void compareTo(double line1, double line2) 
	{
		if (Double.compare(line1, line2) == 0) 
		{ 

			System.out.println("Both Lines are equal"); 
		} 
		else if (Double.compare(line1, line2) < 0)
		{ 

			System.out.println("Line1 is less than Line2"); 
		} 
		else 
		{ 

			System.out.println("Line1 is greater than Line2"); 
		}
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