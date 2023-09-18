import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		// TODO conhecer e importar a classe Scanner

		// Exibir as mensagens para nosso usuário

		// Obter pelo Scanner os valores digitados no terminal

		// Exibir a mensagem conta criada

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Por favor, digite o número da conta: ");
		int numero = scanner.nextInt();
		
		System.out.print("Por favor, digite o número da agência: ");
		String agencia = scanner.next();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = scanner.next();
		
		double saldo = 237.48;
		
		System.out.println("Olá, "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + ", e seu saldo " + saldo + " já está disponível para saque." );
		
	}

}
