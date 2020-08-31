import java.util.Scanner;

public class Convert {
	public static void conversion(double inch) {
		double meter = 0.0254;
		double answer = inch * meter;
		System.out.println(answer);
		
	}
	public static void main (String[] args) {
		System.out.println("Enter inches for conversion:");
		Scanner convert = new Scanner(System.in);
		double inch = convert.nextDouble();
		conversion(inch);
	}
}
