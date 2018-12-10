package promedio;
import java.util.*;
public class Promcomotal {
	private static Scanner sc;
	public static void main (String[] args) {
		sc = new Scanner(System.in);
		String Estudiantes = new String ();
		int N_Curso = 0;
		int N_Estud = 0;
		int N_Notas = 0;
		double acumulador = 0;
		String A = new String();
		String B = new String();
		String C = new String();
		boolean aux = true;
		while (aux == true) {
			System.out.print("Ingrese la cantidad de cursos."
				+"\n"+"Si el número de cursos es indefinido, ingrese 0 para añadir gradualmente"
				+"\n"+"Tras ingresar la cantidad de cursos presione [ENTER]"
				+"\n");
			//Discriminar si es que se poseen los cursos.
			A = sc.next();
			if(A.equals("0")) {
				while(A.equals("0")) {
					N_Curso++;
					System.out.print("Ingrese el nombre el estudiante."
							+"\n"+"Tras ingresar el nombre, pulse [ENTER] para continuar."
							+"\n"+"Si ya acabó de ingresar estudiantes, pulse [0] y luego [ENTER]"
							+"\n"+"Lleva "+(int)Prom.Delta(C)+" estudiantes."
							+"\n");
					Estudiantes = sc.next();
					if(Estudiantes.equals("0")) {
						A = "1";
					}
					else {
						N_Estud++;
						System.out.print("Ingrese la cantidad de nota del estudiante."
							+"\n"+"Si el número de notas es indefinido, ingrese 0 para añadir una a una"
							+"\n"+"Tras ingresar la cantidad de nota presione [ENTER]"
							+"\n");
						//Discriminar si es que se poseen las notas
						B = sc.next();
						//Sin notas definidas
						if(B.equals("0")) {
							while(B.equals("0")) {
								System.out.println("Ingrese una nota del estudiante"
									+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar"
									+"\n"+"Si ya acabó de ingresar notas, pulse [0] y luego [ENTER]"
									+"\n"+"Lleva "+N_Notas+" notas."
									+"\n");
								C = sc.next();
								if(C.equals("0")) {
									B = "1";
								}
								else {
									if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
										System.out.println("Esa nota no es válida.");
									}
									else {
										N_Notas++;
										acumulador = Prom.Delta(C);
									}
								}
							}
						}
						//Con notas definidas
						else {
							double [] notas = new double [(int)Prom.Delta(B)];
						}
					}
				}
			}
			else {
				double [] curso = new double [(int)Prom.Delta(A)];
				for(int i = 0; i < (int)Prom.Delta(A); i++) {
					System.out.print("Ingrese la cantidad de estudiantes que hay en sala."
						+"\n"+"Si el número de estudiantes es indefinido, ingrese 0 para añadir uno a uno"
						+"\n"+"Tras ingresar la cantidad de estudiantes presione [ENTER]"
						+"\n");
					B = sc.next();
					double [] notas = new double [(int)Prom.Delta(B)];
				}
			}
			System.out.print("¿Desea continuar?"
				+"\n"+"	0) No."+"\n"+"	1)Si.");
			A = sc.next();
			
			if(A.equals(A)) {
				aux = false;
			}
		}
	}
}