package java_desafio_iphone.funcoes.smartphone;

import java_desafio_iphone.funcoes.audio.ReprodutorMusical;
import java_desafio_iphone.funcoes.internet.NavegadorInternet;
import java_desafio_iphone.funcoes.telefone.AparelhoTelefonico;

public class Iphone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet{

	public void exibirPagina(String url) {
		System.out.println("NAVEGADOR");
		System.out.println("Exibindo a página web " + url);		
	}

	public void adicionarNovaAba() {
		System.out.println("NAVEGADOR");
		System.out.println("Adicionando uma nova aba");
	}

	public void atualizarPagina() {
		System.out.println("NAVEGADOR");
		System.out.println("Atualizando a página web");
	}

	public void tocar() {
		System.out.println("REPRODUTOR MUSICAL");
		System.out.println("Tocando a música");
	}

	public void pausar() {
		System.out.println("REPRODUTOR MUSICAL");
		System.out.println("Pausando a música");
	}

	public void selecionarMusica(String musica) {
		System.out.println("REPRODUTOR MUSICAL");
		System.out.println("Selecionando a música " + musica);
	}

	public void ligar(String numero) {
		System.out.println("APARELHO TELEFONICO");
		System.out.println("Ligando para o número " + numero);
	}

	public void atender() {
		System.out.println("APARELHO TELEFONICO");
		System.out.println("Atendendo a ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("APARELHO TELEFONICO");
		System.out.println("Iniciando um correio de voz");
	}

}