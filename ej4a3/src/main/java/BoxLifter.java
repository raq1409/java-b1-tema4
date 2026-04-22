/**
 * ENUNCIADO:
 *
 * Un trabajador está apilando cajas en una estantería, una encima de otra.
 * Cada caja tiene un número del 1 al N, siendo 1 la primera que se coloca y N la última.
 *
 * Se desea mostrar por la salida estándar el proceso de apilar las cajas, una a una, en orden ascendente.
 * Este proceso debe realizarse utilizando recursividad.
 *
 * OBJETIVO:
 * Implementar un método recursivo que muestre por la salida estándar:
 *   - "Lifting box 1"
 *   -  "Lifting box 2"
 *   - ...
 *   - "Lifting box N"
 *
 * VARIABLES DE ENTRADA:
 * - int n: número total de cajas a levantar.
 *
 * EJEMPLO:
 * Entrada: n = 3
 * Salida:
 * Lifting box 1
 * Lifting box 2
 * Lifting box 3
 *
 * ENUNCIAT:
 *
 * Un treballador està apilant caixes en una prestatgeria, una sobre l'altra.
 * Cada caixa té un número del 1 al N, sent 1 la primera i N l’última.
 *
 * Es vol mostrar per la sortida estándar el procés d’apilar les caixes, una a una, en ordre ascendent.
 * Aquest procés s’ha d’implementar utilitzant recursivitat.
 *
 * OBJECTIU:
 * Implementar un mètode recursiu que mostri per la so:
 *   - "Lifting box 1"
 *   - "Lifting box 2"
 *   - ...
 *   - "Lifting box N"
 *
 * VARIABLES D’ENTRADA:
 * - int n: nombre total de caixes a aixecar.
 *
 * EXEMPLE:
 * Entrada: n = 3
 * Sortida esperada:
 * Lifting box 1
 * Lifting box 2
 * Lifting box 3
 */

public class BoxLifter {

    /**
     * This method starts the lifting process.
     * You should check if the number is valid (greater than 0).
     * Then, you must call a recursive method to lift the boxes from 1 to n.
     *
     * Example:
     * If n = 3, the output should be:
     * Lifting box 1
     * Lifting box 2
     * Lifting box 3
     */
    public static void liftBoxes(int n) {
        if(n > 0) {
            liftBoxesRecursive(1, n);       
        } else {
            System.out.println("Invalid number of boxes.");
        } 
    }

    /**
     * This is the recursive method you must implement.
     * It receives the current box number and the total number of boxes.
     * It should print the message: "Lifting box X"
     * Then, call itself again with the next box number, until all are lifted.
     *
     * Example:
     * liftBoxesRecursive(1, 3) prints:
     * Lifting box 1
     * Lifting box 2
     * Lifting box 3
     */
    private static void liftBoxesRecursive(int current, int total) {
        if(current > total) {
            return;
        } else {
            System.out.println("Lifting box " + current);
            liftBoxesRecursive(current + 1, total);
        }
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
   
    public static void main(String[] args) {
        liftBoxes(3);
    }
    
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
