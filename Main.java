import java.io.*;
import java.util.*;
public class Main {
	public static void main (String args[]) {
		Hashtable<Integer, Tutor> tu = new Hashtable<Integer, Tutor>();
		Scanner sc = new Scanner (System.in);
		try (BufferedReader br = new BufferedReader (new FileReader ("DatosTutor"))) {
			String line;
			while ((line = br.readLine()) != null ) {
				String [] texto = line.split(":");
				Tutor tutor = new Tutor (Integer.parseInt(texto[0]), new Persona(texto[1], texto[2]));
				tu.put(Integer.parseInt(texto[0]), tutor);
			}
			br.close();
		}
		catch (IOException e) {
   		   System.err.format("IOException: %s\n", e);
    	}

		System.out.print("Introduzca id del tutor: ");
		String line = sc.nextLine();
		int id = Integer.valueOf(line);
		Tutor DaTutor = tu.get(id);
		while (DaTutor == null) {
    		System.out.println("Esa id no corresponde con ningún tutor existente en nuestra base de datos. Por favor indique otra id.");
    		line = sc.nextLine();
    		id = Integer.valueOf(line);
    		DaTutor = tu.get(id);
    	} if (DaTutor != null) {
    		System.out.println("El tutor que busca es: " + DaTutor.getDatos().getNombre() + " " + DaTutor.getDatos().getApellido());
    	}
		
	}
}