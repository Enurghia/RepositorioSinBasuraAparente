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
		String Dat = new String ();
		double acumulador = 0;
		double acumulador2 = 0;
		String A = new String();
		String B = new String();
		String C = new String();
		boolean aux = true;
		//Ciclo reiterativo hasta que se acaben de ingresar curso
		while (aux == true) {
			Dat += "Curso "+(N_Curso+1)+":"+"\n";
			N_Curso++;
			System.out.print("Ingrese la cantidad de cursos."
				+"\n"+"Si el número de cursos es indefinido, ingrese 0 para añadir gradualmente"
				+"\n"+"Tras ingresar la cantidad de cursos presione [ENTER]"
				+"\n");
			//Discriminar si es que se poseen los cursos.
			A = sc.next();
			//Cursos no definidos
			if((int)Prom.Delta(A) == 0) {
				while (aux == true) {
				while((int)Prom.Delta(A) == 0) {
					System.out.print("Ingrese el nombre el estudiante sin usar la tecla [ESPACIO]."
							+"\n"+"Tras ingresar el nombre, pulse [ENTER] para continuar."
							+"\n"+"Si ya acabó de ingresar estudiantes, pulse [0] y luego [ENTER]"
							+"\n"+"Lleva "+N_Estud+" estudiantes."
							+"\n");
					acumulador = 0;
					Estudiantes = sc.next();
					//Si es que se terminan de ingresar los estudiantes
					if(Estudiantes.equals("0")) {
						A = "1";
					}
					else {
						Dat += Estudiantes;
						N_Estud++;
						System.out.print("Ingrese la cantidad de notas del estudiante."
							+"\n"+"Si el número de notas es indefinido, ingrese 0 para añadir una a una"
							+"\n"+"Tras ingresar la cantidad de nota presione [ENTER]"
							+"\n");
						//Discriminar si es que se poseen las notas
						B = sc.next();
						N_Notas = 0;
						//Sin notas definidas
						if(B.equals("0")) {
							while((int)Prom.Delta(B) == 0) {
								System.out.println("Ingrese una nota del estudiante (entre 1 y 7)"
									+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar"
									+"\n"+"Si ya acabó de ingresar notas, pulse [0] y luego [ENTER]"
									+"\n"+"Lleva "+N_Notas+" notas."
									+"\n");
								C = sc.next();
								if((int)Prom.Delta(C) == 0) {
									Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas);
									acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
									B = "1";
								}
								else {
									if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
										System.out.println("Esa nota no es válida.");
									}
									else {
										Dat += "	"+Prom.Delta(C);
										N_Notas++;
										acumulador += Prom.Delta(C);
									}
								}
							}
							Dat += "\n";
							System.out.println(Dat);
						}
						//Con notas definidas
						else {
							for(int i = 0; i < (int)Prom.Delta(B); i++) {
								System.out.println("Ingrese la nota número "+(i+1)+"."
										+"\n"+"Tras ingresar una nota, pulse [ENTER] para continuar");
								C = sc.next();
								if((Prom.Delta(C)<1)||(Prom.Delta(C)>7)) {
									i--;
									System.out.println("Esa nota no es válida.");
								}
								else {
									Dat += "	"+Prom.Delta(C);
									N_Notas++;
									acumulador += Prom.Delta(C);
								}
							}
							Dat += "	"+"Promedio final:	"+Prom.PromedioAc(acumulador, N_Notas)+"\n";
							acumulador2 += Prom.PromedioAc(acumulador, N_Notas);
							System.out.println(Dat);
						}
					}
				}
				//Acaba de ingresar datos de 1 curso
				System.out.print("¿Desea continuar?"
					+"\n"+"	0) No."+"\n"+"	1) Si."+"\n");
				A = sc.next();
				Dat += "\n"+"Promedio del curso "+N_Curso+":"+"	"+Prom.PromedioAc(acumulador2, N_Estud)+"\n";
				System.out.println(Dat);
				if(A.equals("0")) {
					aux = false;
				}
				else {
					A = "0";
					acumulador2 = 0;
					N_Estud = 0;
					Dat += "Curso "+(N_Curso+1)+":"+"\n";
					N_Curso++;
				}
			}
			}
			//Cursos definidos
			else {
				for(int i = 0; i < (int)Prom.Delta(A); i++) {
					System.out.print("Ingrese la cantidad de estudiantes que hay en sala."
						+"\n"+"Si el número de estudiantes es indefinido, ingrese 0 para añadir uno a uno"
						+"\n"+"Tras ingresar la cantidad de estudiantes presione [ENTER]"
						+"\n");
					B = sc.next();
					double [] notas = new double [(int)Prom.Delta(B)];
				}
			}
		}
	}
}