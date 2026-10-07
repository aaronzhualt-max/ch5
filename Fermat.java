import java.util.Scanner;
import java.math.BigInteger;
public class Fermat {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter integer A: ");
	BigInteger a = in.nextBigInteger();
	System.out.print("Enter integer B: ");
	BigInteger b = in.nextBigInteger();
	System.out.print("Enter integer C: ");
	BigInteger c = in.nextBigInteger();
	System.out.print("Enter integer N: ");
	int n = in.nextInt();
	BigInteger fermat = a.pow(n).add(b.pow(n));
	BigInteger fermat2 = c.pow(n);
	if (n > 2 && fermat.equals(fermat2)) {
		System.out.print("Holy Smokes, Fermat was wrong!");
	}
	else {
		System.out.print("No, that doesn't work");
	}
	}
}
