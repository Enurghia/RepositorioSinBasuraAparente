import java.util.Scanner;
public class New {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int [] RespuestaN = new int [10];
		String []RespuestaE = new String [10];
		String Nombre = new String ("");
		String Sexo = new String ("");
		System.out.println("+ Wena, ¿Quién erí?");
		System.out.print("	1. - No preguntí weás."+"\n"+
		"	2. - No tengo idea, ayúdame!"
		+"\n"+"	3. - ¿Quién eres?"+"\n");
		RespuestaN[0] = sc.nextInt();
		switch(RespuestaN[0]){
		case 1:
			System.out.println("+ Ya... ¿Pa qué po'?");
			break;
		case 2:
			System.out.println("+ No weí, ¿Qué pasa?.");
			break;
		case 3:
			System.out.println("+ No no no, yo hago las preguntas.");
			break;
		default:
			System.out.println("+ Habla bien imbécil.");
			break;
		}
		System.out.println("+ Espera, primero dime tú nombre.");
		Nombre = sc.next();
		if (Nombre.length()<4){
			System.out.println("+ Mmmh... No me convence, pero weno"
					+ ", te creeré "+Nombre);
		}
		else{
			System.out.println("+ La verdad no me interesaba, bueno,"
					+ " wena "+Nombre+".");
		}
		System.out.println("+ Ahora, ¿Qué pasa?");
		System.out.print("	1. - Me prersiguen los alienígenas!."+"\n"+
		"	2. - Las tropas del infierno están invadiendo el lugar!"
		+"\n"+"	3. - Me quebré una uña!"+"\n"
		+ "	4. - Kaatharis ha renacido!"+"\n");
		RespuestaN[1] = sc.nextInt();
		switch(RespuestaN[1]){
		case 1:
			System.out.println("+ ... ¿Qué te has tomado?");
			System.out.println("+ No enserio, que yo también quiero probar de eso ;D");
			System.out.println("+ Pero por el momento no hay tiempo, ya están llegando.");
			System.out.println("+ Sígueme, y cuidado por donde caminas.");
			break;
		case 2:
			System.out.println("+ No jodas, ¿Otra vez?.");
			System.out.println("+ Pensé que solo eran caídos...");
			System.out.println("+ De todos modos huyamos, ya vienen.");
			System.out.println("+ Sígueme, no muerdo ;)");
			break;
		case 3:
			System.out.println("+ OH DIOSES SANTOS!!!");
			System.out.println("+ DEBEMOS LLEVARTE A UN MÉDICO AHORA MISMO!!!");
			System.out.println("+ Oh, han de estar muertos la mayoría.");
			System.out.println("+ Ven conmigo, sígueme o seremos los siguientes.");
			break;
		case 4:
			System.out.println("+ Todos sabemos que Kaatharis murio hace mucho"
					+ ", no me vengas con eso.");
			System.out.println("+ Además la invasión de caídos jamás han sido lo suyo.");
			System.out.println("+ Esto ya es algo diferente, deberíamos huir.");
			System.out.println("+ Sígueme o moriremos antes de que nos demos cuenta.");
			break;
		default:
			System.out.println("+ Deja de balbucear y dilo claro.");
			System.out.print("	1. - Me prersiguen los alienígenas!."+"\n"+
					"	2. - Las tropas del infierno están invadiendo el lugar!"
					+"\n"+"	3. - Me quebré una uña!"+"\n"
					+"	4. - Kaatharis ha renacido!"+"\n");
			RespuestaN[1] = sc.nextInt();
			switch(RespuestaN[1]){
			case 1:
				System.out.println("+ Mejor pero... ¿Qué te has tomado?");
				System.out.println("+ No enserio, que yo también quiero probar de eso ;D");
				System.out.println("+ Pero por el momento no hay tiempo, ya están llegando.");
				System.out.println("+ Sígueme, y cuidado por donde caminas.");
				break;
			case 2:
				System.out.println("+ Mejor pero... No jodas, ¿Otra vez?.");
				System.out.println("+ Pensé que solo eran caídos...");
				System.out.println("+ De todos modos huyamos, ya vienen.");
				System.out.println("+ Sígueme, no muerdo ;)");
				break;
			case 3:
				System.out.println("+ ... OH DIOSES SANTOS!!!");
				System.out.println("+ DEBEMOS LLEVARTE A UN MÉDICO AHORA MISMO!!!");
				System.out.println("+ Oh, han de estar muertos la mayoría.");
				System.out.println("+ Ven conmigo, sígueme o seremos los siguientes.");
				break;
			case 4:
				System.out.println("+ Todos sabemos que Kaatharis murio hace mucho"
						+ ", no me vengas con eso.");
				System.out.println("+ Además la invasión de caídos jamás han sido lo suyo.");
				System.out.println("+ Esto ya es algo diferente, deberíamos huir.");
				System.out.println("+ Sígueme o moriremos antes de que nos demos cuenta.");
				break;
			default:
				System.out.println("+ Me rindo...");
				System.out.println("+ Nos vamos a morir en un rato si no nos movemos.");
				System.out.println("+ Sígueme y luego háblame claro, ¿Bueno?.");
				break;
			}
		}
		System.out.println("+ ¿Vamos? (Y/N)");
		RespuestaE[0] = sc.next();
		RespuestaE[0] = RespuestaE[0].toUpperCase();
		switch (RespuestaE[0]){
			case "Y": System.out.println("Wena, ahora, rápido!"); break;
			case "YES": System.out.println("Wena, ahora, rápido!"); break;
			case "S": System.out.println("Wena, ahora, rápido!"); break;
			case "SI": System.out.println("Wena, ahora, rápido!"); break;
			case "N": System.out.println("Weno, bien por ti, yo me voy!"+"\n"+"	- Has muerto"); System.exit(0); break;
			case "NO": System.out.println("Weno, bien por ti, yo me voy!"+"\n"+"	- Has muerto"); System.exit(0); break;
			default:  System.out.println("No entiendo niuna weá, chucha, llegaron..."+"\n"+"	- Has muerto");  System.exit(0); break;
		}
		System.out.println("	*	*	*	"+"\n"+"- Corrimos un rato sin decir nada -");
		System.out.print("	1. - ¿Dónde vamos?"+"\n"+
		"	2. - Espera, realmente, ¿Qué está ocurriendo?"
		+"\n"+"	3. - ¿Por qué me ayudas?"+"\n");
		RespuestaE[2] = sc.next();
		switch(RespuestaN[2]){
		case 1:
			System.out.println("+ Mmmh? No muy lejos hay unas personas que nos podrían ayudar.");
			System.out.println("+ Podremos luchar contra los caídos si es que nos unimos.");
			System.out.println("+ Venga, no tengas miedo :D");
			System.out.println("+ No seas... Uh... Espera, ¿Qué eres? (HOMBRE/MUJER)");
			break;
		case 2:
			switch(RespuestaN[1]){
			case 1:
				System.out.println("+ Espera, ¿Acaso lo que me dijiste no era en serio?");
				System.out.println("+ Me siento algo estafado...");
				System.out.println("+ En fin, tengo unos conocidos que nos podrán ayudar.");
				System.out.println("+ Los caídos que nos invaden son peligrosos.");
				break;
			case 2:
				System.out.println("+ Ya lo dijiste tú, nos invaden.");
				System.out.println("+ ¿O lo dijiste en broma?");
				System.out.println("+ Meh, da igual, ahora mismo algo muy real son los caídos.");
				System.out.println("+ Si nos agarran estaremos muertos.");
				System.out.println("+ Por eso ahora vamos donde unos conocidos.");
				break;
			case 3:
				System.out.println("+ Además de lo de tu uña, nos invaden.");
				System.out.println("+ Hacía mucho tiempo que esto no ocurria.");
				System.out.println("+ Nos pilló desprevenidos la invasión de caídos.");
				System.out.println("+ No importa, unos amigos nos ayudarán, se supone...");
				break;
			case 4:
				System.out.println("+ Pues, según tú, nos invade un dios.");
				System.out.println("+ Pero según yo solo son caídos.");
				System.out.println("+ De cualquier modo, es mejor tener ayuda de otros.");
				break;
			default:
				System.out.println("+ Quisiera que tú tambien me respondieras eso");
				System.out.println("+ Antes cuando pregunté sobre si pasaba algo, solo dijiste cosas incoherentes");
				System.out.println("+ Pero bueno, ahora vamos donde unos conocidos que nos podrán ayudar.");
				System.out.println("+ No quiero ser devorado por los caídos.");
				break;
			}
			System.out.println("+ A todo esto, ¿Qué eres? (HOMBRE/MUJER)");
			break;
		case 3:
			System.out.println("+ Nada en especial, solamente que estabas en el suelo mientras huía.");
			System.out.println("+ Si te negabas a venir conmigo, te iba a dejar morir.");
			System.out.println("+ Pero ya que estamos en el mismo barco, intentemos salvarnos.");
			System.out.println("+ Hey, a todo esto, ¿Qué eres? (HOMBRE/MUJER)");
			break;
		default:
			System.out.println("+ Bueno, ahora que hablas bien supongo que está bien.");
			System.out.println("+ Un ejercito de caídos empezó a invadir el pueblo esta tarde.");
			System.out.println("+ Muchos muertos, me sorprende que te hayas salvado.");
			System.out.println("+ Por cierto, ¿Qué eres? (HOMBRE/MUJER)");
			break;
		}
		Sexo = sc.next();
		Sexo = Sexo.toUpperCase();
		switch (Sexo){
		case "MUJER": System.out.println("+ Vaya, algo inesperado... Solo espero que sea verdad :x");
			System.out.print("	1. - ¿Por qué?"+"\n"+
					"	2. - Oye, eso ofende viejo."
					+"\n");
			RespuestaN[3] = sc.nextInt();
			switch (RespuestaN[3]) {
			case 1: System.out.println("+ Eh... Nada, nada sexista xd"); break;
			case 2: System.out.println("+ Ya, ya, perdóname, no fue intencionado xd"); break;
			default: System.out.println("+ Espera, ¿Qué?"+"\n"+"+ Bah, da igual."); break;
			}
			
			break;
		case "HOMBRE": System.out.println("+ Bueno, lo típico por estos lares, supongo."); break;
		case "HELICOPTERO": System.out.println("+ Que curioso, no sabía que aún había gente así :x"); break;
		case "OTRO": System.out.println("+ Oh... Pues... Bueno, lo respeto :X");break;
		case "GODZILLA": System.out.println("+ Pues... Que bien, supongo :x");break;
		default:  System.out.println("+ ... Okay...?");break;
		}
		System.out.println("+ Tienes cara de dudas, ¿Alguna pregunta?");
		System.out.print("	1. - ¿Quien eres?"+"\n"+
		"	2. - ¿Quienes son los caídos?"+"\n");
	}
}
