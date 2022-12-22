package dic;
	
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
		public class Ejercicio10 {
		  public static void main(String[] args) {
		    // Creamos el diccionario con al menos 20 palabras
		    HashMap<String, String> diccionario = new HashMap<>();
		    
			diccionario.put("generation", "generación");
			diccionario.put("front", "frente");
			diccionario.put("back", "atrás");
			diccionario.put("hola", "hello");
			diccionario.put("adiós", "goodbye");
			diccionario.put("perro", "dog");
			diccionario.put("gato", "cat");
			diccionario.put("sol", "sun");
			diccionario.put("agua", "water");
			diccionario.put("vino", "wine");
			diccionario.put("libro", "book");
			diccionario.put("mesa", "table");
			diccionario.put("silla", "chair");
			diccionario.put("casa", "house");
			diccionario.put("estrella", "star");
			diccionario.put("reloj", "clock");
			diccionario.put("luna", "moon");
			diccionario.put("sol", "sun");
			diccionario.put("mar", "sea");
			diccionario.put("cielo", "sky");


		    // Escogemos al azar 5 palabras del diccionario
		    Random random = new Random();
		    String[] palabras = new String[5];
		    for (int i = 0; i < palabras.length; i++) {
		      int index = random.nextInt(diccionario.size());
		      palabras[i] = (String) diccionario.keySet().toArray()[index];
		    }

		    // Pedimos al usuario que teclee la traducción al inglés de cada una de las palabras
		    Scanner sc = new Scanner(System.in);
		    int respuestasCorrectas = 0;
		    for (String palabra : palabras) {
		      System.out.print("Traducción de '" + palabra + "': ");
		      String traduccion = sc.nextLine();
		      if (traduccion.equals(diccionario.get(palabra))) {
		        System.out.println("Correcto!");
		        respuestasCorrectas++;
		      } else {
		        System.out.println("Incorrecto. La traducción correcta es '" + diccionario.get(palabra) + "'.");
		      }
		    }

		    // Mostramos cuántas respuestas correctas e incorrectas tiene el usuario
		    System.out.println("Tuviste " + respuestasCorrectas + " respuestas correctas y " + (palabras.length - respuestasCorrectas) + " respuestas incorrectas.");
		    sc.close();
		  }
	
}

	

