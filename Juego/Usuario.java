package Juego;
public class Usuario {
	//Atributos
	private String nombreUsuario = new String ();
	private String contrase�a = new String ();
	private String correo = new String ();
	//M�todos
	public Usuario (String nombreUsuario, String contrase�a, String correo) {
		nombreUsuario = "Usuario";
		contrase�a = "Clave";
		correo = "correo";
	}
	public void MDatosUsuario () {
		System.out.println(nombreUsuario);
		System.out.println(contrase�a);
		System.out.println(correo);
	}
}