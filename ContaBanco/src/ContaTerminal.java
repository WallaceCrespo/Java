import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		// TODO conhecer e importar a classe Scanner

		// Exibir as mensagens para nosso usu�rio

		// Obter pelo Scanner os valores digitados no terminal

		// Exibir a mensagem conta criada

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Por favor, digite o n�mero da conta: ");
		int numero = scanner.nextInt();
		
		System.out.print("Por favor, digite o n�mero da ag�ncia: ");
		String agencia = scanner.next();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nome = scanner.next();
		
		double saldo = 237.48;
		
		System.out.println("Ol�, "+ nome + ", obrigado por criar uma conta em nosso banco, sua ag�ncia �: " + agencia + ", conta: " + numero + ", e seu saldo " + saldo + " j� est� dispon�vel para saque." );
		
	}

}
