package Telefone;

public class Telefone implements aparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}

}
