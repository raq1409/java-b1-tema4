import java.util.Arrays;

/**
 * ENUNCIADO:
 *
 * Una empresa de reparto quiere analizar la eficiencia de sus repartidores.
 * Cada repartidor ha registrado el tiempo total (en minutos) que ha tardado en completar sus entregas.
 * El objetivo es ordenar esos tiempos de mayor a menor para identificar a los más lentos primero.
 *
 * Como los datos suelen estar casi ordenados debido al control frecuente de tiempos,
 * se utilizará el algoritmo Bubble Sort, que es eficiente en este tipo de listas casi ordenadas.
 * Se debe implementar Bubble Sort en orden descendente.
 *
 * VARIABLES DE ENTRADA:
 * - times (int[]) → array con los tiempos en minutos
 *
 * TABLA DE TIEMPOS DE REPARTIDORES:
 *
 * | Nº Repartidor | Tiempo (minutos) |
 * |---------------|------------------|
 * | 1             | 45               |
 * | 2             | 30               |
 * | 3             | 55               |
 * | 4             | 20               |
 * | 5             | 40               |
 * | 6             | 35               |
 * | 7             | 60               |
 * | 8             | 25               |
 * | 9             | 50               |
 * | 10            | 15               |
 *
 * EJEMPLO:
 * Entrada:
 * times = [45, 30, 55, 20, 40, 35, 60, 25, 50, 15]
 * Salida:
 * Sorted times (descending): [60, 55, 50, 45, 40, 35, 30, 25, 20, 15]
 *
 * ENUNCIAT:
 *
 * Una empresa de repartiment vol analitzar l’eficiència dels seus repartidors.
 * Cada repartidor ha registrat el temps total (en minuts) que ha trigat a completar les entregues.
 * L’objectiu és ordenar aquests temps de més a menys per identificar els més lents primer.
 *
 * Com que les dades acostumen a estar gairebé ordenades per les revisions freqüents dels temps,
 * es farà servir l’algorisme Bubble Sort, que és eficient en aquest tipus de llistes quasi ordenades.
 * Cal implementar el Bubble Sort en ordre descendent.
 *
 * VARIABLES D’ENTRADA:
 * - times (int[]) → array amb els temps en minuts
 *
 * TAULA DE TEMPS DELS REPARTIDORS:
 *
 * | Nº Repartidor | Temps (minuts)   |
 * |---------------|------------------|
 * | 1             | 45               |
 * | 2             | 30               |
 * | 3             | 55               |
 * | 4             | 20               |
 * | 5             | 40               |
 * | 6             | 35               |
 * | 7             | 60               |
 * | 8             | 25               |
 * | 9             | 50               |
 * | 10            | 15               |
 *
 * EXEMPLE:
 * Entrada:
 * times = [45, 30, 55, 20, 40, 35, 60, 25, 50, 15]
 * Sortida:
 * Sorted times (descending): [60, 55, 50, 45, 40, 35, 30, 25, 20, 15]
 */
 
public class DeliverySorter {
    public static void bubbleSortDescending(int[] times) {
        for(int i = 0; i < times.length - 1; i++) {
            for(int j = 0; j < times.length - 1 - i; j++) {
                if(times[j] < times[j + 1]) {
                    int temp = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int[] times = {45, 30, 55, 20, 40, 35, 60, 25, 50, 15};
        bubbleSortDescending(times);
        System.out.println("Sorted times (descending): " + Arrays.toString(times));
    }
    
}
