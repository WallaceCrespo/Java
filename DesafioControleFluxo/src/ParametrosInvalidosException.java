
public class ParametrosInvalidosException {

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		while (parametroUm >= parametroDois) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois-parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
		for (int contar = 0; parametroUm < parametroDois; contagem++) {
			
		}
	}
}
