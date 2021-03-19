import java.util.Locale;
import java.util.Scanner;

public class ExercicioDiferenca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero:");
		int a = sc.nextInt();
		System.out.println("digite o segundo numero:");
		int b= sc.nextInt();
		System.out.println("digite o terceiro numero:");
		int c = sc.nextInt();
		System.out.println("digite o quarto numero:");
		int d= sc.nextInt();
		int diferenca = a*b-c*d;
		
		System.out.println("A diferença é: " + diferenca);
		
		sc.close();

	}

}
