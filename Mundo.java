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
			
		}
	}
}