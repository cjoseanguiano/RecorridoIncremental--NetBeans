/*
 * Realiza un recorrido de 0 a 50 debe realizar el incremento de 2 en 2, 
 * si el número es divisible entre 3 muestrelo de los contrario no lo muestre.
 * Recuerde debe hacer uso de algun ciclo while o for. 
 * serie del 50 al 0: 50-48-46-44-42-40-38-36-34-32-30-28-26-24-22-20-18-16-14-12-10-8-6-4-2 
 * divisible entre 3: 48-42-36-30-24-18-12-6. 
 */
package recorridoincremental;

/**
 *
 * @author carlosjoseanguiano
 */
public class RecorridoIncremental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int k = 0;
        for (int i = 1; i <= 50; i++) {
            // System.out.println("Valor normal: " + i);
            k = i * 2;
            if (k <= 50) {
                //System.out.println("Multiplicado" + k);
                if (k % 3 == 0) {
                    System.out.println("Divisibles: " + k);
                }

            }
        }

    }

}
