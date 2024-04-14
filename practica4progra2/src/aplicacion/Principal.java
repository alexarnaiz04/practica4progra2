package aplicacion;

import palabras.CalculadoraDistancias;
import java.util.Scanner;

/**
 * La clase Principal es la clase principal del programa que permite al usuario
 * ingresar dos palabras y calcular la distancia de edición entre ellas utilizando
 * la clase CalculadoraDistancias.
 */
public class Principal {

    /**
     * El método main es el punto de entrada del programa.
     * Permite al usuario ingresar dos palabras y muestra la distancia de edición
     * entre ellas.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.nextLine();

        int distancia = CalculadoraDistancias.calcularDistancia(palabra1, palabra2);
        
        System.out.println("La distancia entre las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" es: " + distancia);

        scanner.close(); 
    }
}
