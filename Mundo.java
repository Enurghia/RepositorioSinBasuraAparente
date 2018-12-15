package Mundo;
import java.io.*;

public class Mundo {
	public static void main(String[] args) {
		BufferedWriter BW = null;
		FileWriter FW = null;
		File file = new File("Datos.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
			FW = new FileWriter(file.getAbsolutePath(), true);
			BW = new BufferedWriter(FW);
			BW.write("Algo");
			BW.newLine();
			BW.flush();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(BW != null) {
					BW.close();
				}
				if(FW != null) {
					FW.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		FileReader FR = null;
		BufferedReader BR = null;
		try {
			FR = new FileReader(file.getAbsoluteFile());
			BR = new BufferedReader(FR);
			String lectura = BR.readLine();
			int i = 1;
			while(lectura != null) {
				System.out.println("Linea "+i+" - "+lectura);
				lectura = BR.readLine();
				i++;
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				if(BR != null) {
					BR.close();
				}
				if(FR != null) {
					FR.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}