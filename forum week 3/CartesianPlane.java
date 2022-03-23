// Java program to check quadrant
import java.util.Scanner;
import java.io.*;

public class CartesianPlane {
	static Scanner console = new Scanner(System.in);

	// Function to check quadrant

	public static void main (String[] args)
	{
        double x, y;
        
        System.out.println("Enter x coordinate: ");
        x = console.nextDouble();
        System.out.println();

        System.out.println("Enter y coordinate: ");
        y = console.nextDouble();
        System.out.println();


		if (x > 0 && y > 0)
			System.out.println("lies in First quadrant");

		else if (x < 0 && y > 0)
			System.out.println("lies in Second quadrant");

		else if (x < 0 && y < 0)
			System.out.println("lies in Third quadrant");

		else if (x > 0 && y < 0)
			System.out.println("lies in Fourth quadrant");

		else if (x == 0 && y > 0)
			System.out.println("lies at positive y axis");

		else if (x == 0 && y < 0)
			System.out.println("lies at negative y axis");

		else if (y == 0 && x < 0)
			System.out.println("lies at negative x axis");

		else if (y == 0 && x > 0)
			System.out.println("lies at positive x axis");

		else
			System.out.println("lies at origin");
	}
	
}
