package banco;

import java.util.Scanner;

public interface banco {

	int saldo = 5000;

	public static void transferir() {
		System.out.printf("Transferindo o valor de R$: 1.000,00");
	}

	public static void depositar() {
		System.out.printf("Depositando o valor de R$: 2000,00");
	}

	public static void sacar() {
		System.out.printf("Sacando o valor de R$: 500,00 ");
		;
	}

}
