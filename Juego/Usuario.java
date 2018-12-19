package Juego;
public class Usuario {
	//Atributos
	private String nombreUsuario = new String ();
	private String contraseña = new String ();
	private String correo = new String ();
	//Métodos
	public Usuario (String nombreUsuario, String contraseña, String correo) {
		nombreUsuario = "Usuario";
		contraseña = "Clave";
		correo = "correo";
	}
	public void MDatosUsuario () {
		System.out.println(nombreUsuario);
		System.out.println(contraseña);
		System.out.println(correo);
	}
}