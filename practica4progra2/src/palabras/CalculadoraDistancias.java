package palabras;
/**
 * @author Alejandro Arnaiz 
 */
public class CalculadoraDistancias {
    /**
     * Método que calcula el mínimo de 3 valores.
     * @param borrado valor 1   
     * @param insercion valor 2
     * @param sustitucion valor 3

     * @return el valor mínimo de estos 3 valores.
     */
    public static int min(int borrado, int insercion, int sustitucion) {
        return Math.min(Math.min(borrado, insercion), sustitucion);
    }
    /**
     * Método que calcula la distancia de edicion entre dos palabras (String).
     * @param X palabra 1
     * @param Y palabra 2
     * @return distancia de edicion
     */
    
    public static int calcularDistancia(String palabra1, String palabra2) {
        int p1 = palabra1.length();
        int p2 = palabra2.length();
        int D[][] = new int[p1 + 1][p2 + 1];  
        for (int i = 0; i <= p1; i++) {     
            D[i][0] = i;
        }
        for (int j = 0; j <= p2; j++) {    
            D[0][j] = j;
        }

        int cost;
        for(int i = 1; i <= p1; i++){
            for(int j = 1; j <= p2; j++){
                if(palabra1.charAt(i - 1) == palabra2.charAt(j - 1)){
                    cost = 0;
                }else{
                    cost = 1;
                }

                D[i][j] = Math.min(D[i - 1][j] + 1, Math.min(D[i][j - 1] + 1, D[i - 1][j - 1] + cost));
            }
        }
        return D[p1][p2];
    }
}