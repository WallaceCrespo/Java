import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro par�metro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo par�metro: ");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);

		} catch (Exception exception) {
			// imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro

		}

	}

	static void contar(int parametroUm, int parametroDois) throws Exception {
		// validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		if (parametroDois > parametroUm) {

			int contagem = parametroDois - parametroUm;
			// realizar o for para imprimir os n�meros com base na vari�vel contagem
			for (contagem = parametroUm; contagem < parametroDois; contagem++) {
				System.out.println("Imprimindo o n�mero: " + contagem);
			}

		} else {
			System.out.println("O segundo par�metro deve ser maior que o primeiro");

		}

	}
}
