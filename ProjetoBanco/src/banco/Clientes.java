package banco;

public interface  Clientes {

	String nome = "Wallace";
	int idade = 28;
	int CPF = 12312314;
	int Agencia = 2134;
	int ContaCorrente = 534223 - 8;

	public String getNome();

	public void setNome(String nome);

	public int getIdade();

	public void setIdade(int idade);

	public int getCPF();

	public void setCPF(int cPF);

	public int getAgencia();

	public void setAgencia(int agencia);

	public int getContaCorrente();

	public void setContaCorrente(int contaCorrente);

}
