package Musicas;

public class Musicas implements reprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada");
		
	}

}
