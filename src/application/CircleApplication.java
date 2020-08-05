package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorCircle;

public class CircleApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		CalculatorCircle calc = new CalculatorCircle();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = CalculatorCircle.circumference(radius);
		
		double v = CalculatorCircle.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorCircle.PI);
		
		sc.close();
	}

}
