package java_desafio_iphone.smartphone;

import java_desafio_iphone.funcoes.smartphone.Iphone;

public class Smartphone {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar("61995908225");
		System.out.println();
		iphone.atender();
		System.out.println();
		iphone.iniciarCorreioVoz();
		System.out.println();
		iphone.exibirPagina("https://youtube.com/");
		System.out.println();
		iphone.atualizarPagina();
		System.out.println();
		iphone.adicionarNovaAba();
		System.out.println();
		iphone.selecionarMusica("Charisma - KISS");
		System.out.println();
		iphone.tocar();
		System.out.println();
		iphone.pausar();
	}

}