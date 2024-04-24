package palabras;
/**
 * @author Alejandro Arnaiz 
 */
public class CalculadoraDistancias {
    /**
     * Método que calcula el mínimo de 3 valores.
     *
     * @param a valor que contiene el caso de borrado.
     * @param b valor que contiene el caso de insercion.
     * @param c valor que contiene el caso de sustitución.
     * @return el valor mínimo de estos 3 valores.
     */
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    /**
     * Método que calcula la distancia de edicion entre dos palabras (String).
     * @param X palabra 1
     * @param Y palabra 2
     * @return distancia de edicion
     */
    public static int calcularDistancia(String X, String Y) {
        int n = X.length();
        int m = Y.length();
        int D[][] = new int[n + 1][m + 1];  
        for (int i = 0; i <= n; i++) {     
            D[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {    
            D[0][j] = j;
        }
        for (int i = 1; i <= n; i++) {   
        for (int j = 1; j <= m; j++) {  
            D[i][j] = min(D[i - 1][j] + 1, D[i][j - 1] + 1, D[i - 1][j - 1] + (X.charAt(i - 1) == Y.charAt(j - 1) ? 0 : 1 + 1));
        }
        }
        return D[n][m];
    }
}