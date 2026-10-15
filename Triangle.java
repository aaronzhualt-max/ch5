import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for the first length: ");
		int a = in.nextInt();
		System.out.print("Enter a value for the second length: ");
		int b = in.nextInt();
		System.out.print("Enter a value for the third length: ");
		int c = in.nextInt();
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.print("No length can be zero or less");
		}
		else if (a + b < c || a + c < b || b + c < a) {
			System.out.print("Invalid lengths, a triangle cannot be formed");
		} else {
			System.out.print("A triangle can be formed");
		}
	}
}
