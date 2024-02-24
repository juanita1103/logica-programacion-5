import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Cuaderno","Notebook");
        diccionario.put("Bolso","Purse");
        diccionario.put("Casa","House");
        diccionario.put("Corazon","Heart");
        diccionario.put("Uña","Nail");
        diccionario.put("Cama","Bed");
        diccionario.put("Nevera","Fridge");
        diccionario.put("Ventana","Window");
        diccionario.put("Escritorio","Desk");
        diccionario.put("Parque","Park");
        diccionario.put("Tienda","Store");
        diccionario.put("Chaqueta","Jacket");
        diccionario.put("Gafas","Glasses");
        diccionario.put("Falda","Skirt");
        diccionario.put("Sol","Sun");
        diccionario.put("Silla","Chair");
        diccionario.put("Calle","Street");
        diccionario.put("Perro","Dog");
        diccionario.put("Mano","Hand");
        diccionario.put("Ojos","Eyes");

        Random random = new Random();
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        String[] palabraSeleccionada = new String[5];

        for (int i = 0; i < 5; i++) {
            palabraSeleccionada[i] = palabras[random.nextInt(palabras.length)];
        }

        Scanner scan = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;

        for (String palabra : palabraSeleccionada) {
            System.out.print("Traduce '" + palabra + "' al inglés: ");
            String respuesta = scan.nextLine().trim().toLowerCase();

            if (respuesta.equalsIgnoreCase(diccionario.get(palabra).toLowerCase())) {
                System.out.println("¡Correcto!");
                correcto++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                incorrecto++;
            }
        }

        // Mostrar el resultado final
        System.out.println("Respuestas correctas: " + correcto);
        System.out.println("Respuestas incorrectas: " + incorrecto);
    }
}
 