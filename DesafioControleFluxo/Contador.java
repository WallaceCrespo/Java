import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (Exception exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro

		}

	}

	static void contar(int parametroUm, int parametroDois) throws Exception {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois > parametroUm) {

			int contagem = parametroDois - parametroUm;
			// realizar o for para imprimir os números com base na variável contagem
			for (contagem = parametroUm; contagem < parametroDois; contagem++) {
				System.out.println("Imprimindo o número: " + contagem);
			}

		} else {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}

	}
}
