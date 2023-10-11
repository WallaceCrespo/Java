
import banco.Clientes;
import banco.banco;
import conta.Corrente;
import conta.Poupanca;

public abstract class Operacoes implements banco, Clientes, Corrente, Poupanca {

	public static void main(String[] args) {

		System.out.println("Cliente " + nome + " CPF Nº: " + CPF);

		Corrente.Corrente();
		Poupanca.Poupanca();

		System.out.println("Aguarde");

		banco.depositar();

		System.out.println("\n");

		banco.sacar();

		System.out.println("\n");

		banco.transferir();

	}

}
