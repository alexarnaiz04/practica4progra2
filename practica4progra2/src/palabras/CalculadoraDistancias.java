package palabras;

/**
 * Clase que calcula la distancia entre dos puntos
 *
 * @author Daniel Fernández López
 */
public class CalculadoraDistancias {

    /**
     * Método que calcula el mínimo de 3 valores.
     *
     * @param a valor que contiene el caso de deletion.
     * @param b valor que contiene el caso de insertion.
     * @param c valor que contiene el caso de substitution.
     * @return el valor mínimo de los 3 valores.
     */
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    /**
     * Método que calcula la distancia de edicion entre dos palabras (String).
     *
     * @param X palabra 1
     * @param Y palabra 2
     * @return distancia de edicion
     */
    public static int calcularDistancia(String X, String Y) {
        int n = X.length();
        int m = Y.length();
        int D[][] = new int[n + 1][m + 1];  // inicializa matriz de dos dimensiones, con n+1 filas y m+1 columnas
        for (int i = 0; i <= n; i++) {     // inicializa la primera fila
            D[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {    // inicializa la primera columna
            D[0][j] = j;
        }
        for (int i = 1; i <= n; i++) {   // recorre la matriz por filas
            for (int j = 1; j <= m; j++) {  // recorre la matriz por columnas
                D[i][j] = min(D[i - 1][j] + 1, D[i][j - 1] + 1, D[i - 1][j - 1] + (X.charAt(i - 1) == Y.charAt(j - 1) ? 0 : 1 + 1));
                // calcula la distancia de edición con los distintos casos: a (deletion), b (insertion), c (substitution).
            }
        }
        return D[n][m];
    }
}