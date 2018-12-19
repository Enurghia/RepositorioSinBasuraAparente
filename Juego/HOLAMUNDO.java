package Juego;

public class HOLAMUNDO {

	public static void main(String[] args) {
		Entrenador [] Amigos = new Entrenador [3];
		Humano [] NPCs = new Humano [3];
		for(int i = 0; i < Amigos.length; i++) {
			Amigos[i] = new Entrenador();
		}
		for(int i = 0; i < Amigos.length; i++) {
			NPCs[i] = new Humano();
		}
	}

}
