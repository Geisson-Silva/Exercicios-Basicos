import java.util.Locale;
import java.util.Scanner;

public class horasTrabalhadas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o numero do funcionário:");
		int numero = sc.nextInt();
		System.out.println("digite as horas trabalhadas:");
		double horas = sc.nextDouble();
		System.out.println("digite o valor da hora trabalhada:");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.printf("O funcionário %d receberá: ", numero);
		System.out.println("R$ " + salario);

		sc.close();
	}

}
