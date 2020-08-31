import java.util.Scanner;

public class Product {
	public static void product (double inputA, double inputB) {
		double outcome = inputA * inputB;
		System.out.println(outcome);
		
	}
	public static void main (String[] args) {
		System.out.println("Enter first input:");
		Scanner resolve = new Scanner(System.in);
		double inputA = resolve.nextDouble();
		System.out.println("Enter second input:");
		double inputB = resolve.nextDouble();
		System.out.println("Answer equals:");
		product(inputA, inputB);
	}
}

