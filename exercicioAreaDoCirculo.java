import java.util.Locale;
import java.util.Scanner;

public class exercicioAreaDoCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o raio: ");
		double x = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(x, 2);
		
		System.out.printf("A área é: %.4f%n", area);
		
		sc.close();
	}

}
