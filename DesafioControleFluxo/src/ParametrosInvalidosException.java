
public class ParametrosInvalidosException {

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		
		while (parametroUm >= parametroDois) {
			System.out.println("O segundo par�metro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois-parametroUm;
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for (int contar = 0; parametroUm < parametroDois; contagem++) {
			
		}
	}
}
