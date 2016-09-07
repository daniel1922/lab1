
import java.util.Scanner;
public abstract class app {
		 
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
System.out.println("Welcome to Grand Circus'Room Detail Generator");
		 
		String continueLoop;
		do{
		System.out.println();
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		double area = length * width;
		double perimeter = (2 * width) + (2 * length);
		System.out.print("Area: " + area);
		System.out.println();
		System.out.println("Perimeter " + perimeter);
		System.out.println();
		System.out.print("Continue? (y/n): ");
		continueLoop = sc.next();
		}
		while(continueLoop.equalsIgnoreCase("Y"));
		 
		}
		}