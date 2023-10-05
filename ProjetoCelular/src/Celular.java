import chamadas.Atender;
import chamadas.CorreioVoz;
import chamadas.Ligar;
import navegadorInternet.AdicionarNovaAba;
import navegadorInternet.AtualizarPagina;
import navegadorInternet.ExibirPagina;
import reprodutorMusical.Pausar;
import reprodutorMusical.SelecionarMusica;
import reprodutorMusical.Tocar;

public class Celular implements Atender, Ligar, CorreioVoz, SelecionarMusica, Pausar, Tocar, ExibirPagina, AdicionarNovaAba, AtualizarPagina {

	public static void main(String[] args) {
		// TODO Stub de método gerado automaticamente

		Celular iphone = new Celular();

		Atender.Atendimento();
		Ligar.Ligar();
		CorreioVoz.CorreioVoz();
		
		SelecionarMusica.SelecionarMusica();
		Pausar.Pausar();
		Tocar.Tocar();
		
		ExibirPagina.ExibirPagina();
		AdicionarNovaAba.AdicionarNovaAba();
		AtualizarPagina.AtualizarPagina();
		
	}

}
