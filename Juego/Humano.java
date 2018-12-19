package Juego;

public class Humano {
	//Atributos
	private String Nombre = new String ();
	private String Tamaño = new String ();
	private char Genero;
	private int Edad;
	private boolean Pelo;
	//Métodos
	public Humano () {
		Nombre = "null";
		Tamaño = "null";
		Genero = 'O';
		Edad = 0;
		Pelo = true;
		System.out.println("¡HA NACIDO UNA PERSONA!");
	}
}
