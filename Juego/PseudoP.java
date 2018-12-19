package Juego;

public class PseudoP {
	//
	private String Nombre = new String ();
	private String Tipo = new String ();
	private int Edad;
	private char Genero;
	private int Nivel;
	private int Exp;
	private String Tamaño = new String ();
	private int Salud;
	private String Ataque1 = new String ();
	private String Ataque2 = new String ();
	private String Ataque3 = new String ();
	private String Ataque4 = new String ();
	//
	public PseudoP () {
		Nombre = null;
		Tipo = null;
		Edad = 0;
		Genero = 'O';
		Nivel = 0;
		Exp = 0;
		Tamaño = null;
		Salud = 0;
		Ataque1 = null;
		Ataque2 = null;
		Ataque3 = null;
		Ataque4 = null;
	}
	public void WrNombre (String Nombre){
		this.Nombre = Nombre;
	}
}
