package matrices;

import java.util.logging.Level;
import java.util.logging.Logger;
import matrices.DimensionesIncompatibles;
import matrices.Matriz;

public class Driver {

    public static void main(String[] args) {
        Matriz m1 = new Matriz(3, 4, true);
        System.out.println(m1);
        Matriz m2 = new Matriz(3, 4, true);
        Matriz m2_invertida = Matriz.invertirMatriz(m2);
        System.out.println(m2);
        try {
            System.out.println("Suma de matrices");
            System.out.println(Matriz.sumarDosMatrices(m1, m2));           
            System.out.println("Inversión de matriz m2");
            System.out.println(m2_invertida);
            System.out.println("Multiplicación de matrices m1 y m2_invertida");
            System.out.println(Matriz.multiplicarDosMatrices(m1, m2_invertida));
        } catch (DimensionesIncompatibles ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
