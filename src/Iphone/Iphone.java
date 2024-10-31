package Iphone;

import Internet.navegadorInternet;
import Musicas.reprodutorMusical;
import Telefone.aparelhoTelefonico;

public class Iphone implements navegadorInternet, reprodutorMusical, aparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando via iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo via iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz via iphone");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando via iphone");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando via iphone");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando via iphone");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo via iphone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando aba via iphone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando aba via iphone");
		
	}

}
