import java.util.Locale;
import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero:");
		int x = sc.nextInt();
		System.out.println("digite o segundo numero:");
		int y = sc.nextInt();
		int soma = x + y;
		
		System.out.println("O resultado é: " + soma);
		
		sc.close();
	}

}
