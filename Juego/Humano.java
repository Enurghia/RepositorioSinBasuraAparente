package Juego;

public class Humano {
	//Atributos
	private String Nombre = new String ();
	private String Tama�o = new String ();
	private char Genero;
	private int Edad;
	private boolean Pelo;
	//M�todos
	public Humano () {
		Nombre = "null";
		Tama�o = "null";
		Genero = 'O';
		Edad = 0;
		Pelo = true;
		System.out.println("�HA NACIDO UNA PERSONA!");
	}
}
