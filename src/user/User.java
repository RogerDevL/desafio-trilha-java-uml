package user;

import Iphone.Iphone;
import Musicas.Musicas;
import Musicas.reprodutorMusical;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reprodutorMusical musica = new Musicas();
		
		musica.tocar();
		
		Iphone iphone = new Iphone();
		
		iphone.tocar();

	}

}
