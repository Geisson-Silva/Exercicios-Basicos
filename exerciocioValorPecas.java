import java.util.Locale;
import java.util.Scanner;

public class exerciocioValorPecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Digite o código da peça: ");
		//int codigo1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		int qt = sc.nextInt();
		System.out.println("Digite o valor da peça: ");
		double valor = sc.nextDouble();
		
		//System.out.println("Digite o código da segunda peça : ");
		//int codigo2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças: ");
		int qt2 = sc.nextInt();
		System.out.println("Digite o valor da segunda peça : ");
		double valor2 = sc.nextDouble();
		
		double conta = qt*valor+qt2*valor2;
		
		System.out.printf("O valor a ser pago é %.2f%n: ", conta);
		
		
		sc.close();
	}

}
