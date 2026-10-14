import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for a: ");
		double a = in.nextDouble();
		System.out.print("Enter a value for b: ");
		double b = in.nextDouble();
		System.out.print("Enter a value for c: ");
		double c = in.nextDouble();
		double discriminant = Math.pow(b, 2) - 4*a*c;
		
		if (discriminant < 0 || a == 0) {
			System.out.print("No answer");
		} 
		else if (discriminant >= 0) {
			double result1 = (b * -1 + Math.sqrt(discriminant)) / 2*a;
			double result2 = (b * -1 - Math.sqrt(discriminant)) / 2*a;
			if (result1 == result2) {
				System.out.print("The answer is " + result1);
			} else {
				System.out.print("The answer is " + result1 + " and " + result2);
			}
		}
	}
}
