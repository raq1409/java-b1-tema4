/**
 * ENUNCIADO:
 *
 * Una tienda quiere ordenar sus productos según su eficiencia de stock,
 * definida como la relación entre unidades disponibles y tasa de consumo diario.
 * Esta eficiencia ya ha sido calculada como un número real (key ratio) para cada producto.
 *
 * Como los datos suelen estar casi ordenados debido al seguimiento regular del stock,
 * se utilizará el algoritmo de inserción, que es especialmente eficiente en estos casos.
 *
 * Se desea ordenar los productos de menor a mayor eficiencia utilizando el
 * algoritmo de inserción.
 *
 * VARIABLES DE ENTRADA:
 * - eficiencias[] (double[]): key ratio = unidades / consumo diario
 *
 * TABLA DE PRODUCTOS:
 *
 * | Nº | Producto         | Eficiencia (key ratio) |
 * |----|------------------|------------------------|
 * | 1  | Arroz            | 12.0                   |
 * | 2  | Lentejas         | 10.0                   |
 * | 3  | Harina           | 4.0                    |
 * | 4  | Azúcar           | 5.0                    |
 * | 5  | Sal              | 4.0                    |
 * | 6  | Pasta            | 9.0                    |
 * | 7  | Galletas         | 10.0                   |
 * | 8  | Leche en polvo   | 6.0                    |
 * | 9  | Café             | 9.0                    |
 * | 10 | Té               | 10.0                   |
 *
 * EJEMPLO DE SALIDA:
 * [4.0, 4.0, 5.0, 6.0, 9.0, 9.0, 10.0, 10.0, 10.0, 12.0]
 *
 * ENUNCIAT:
 *
 * Una botiga vol ordenar els seus productes segons la seva eficiència d'estoc,
 * definida com la relació entre les unitats disponibles i el consum diari.
 * Aquesta eficiència ja ha estat calculada com un número real (key ratio) per a cada producte.
 *
 * Com que les dades solen estar gairebé ordenades per un seguiment regular de l’estoc,
 * es farà servir l’algorisme d’inserció, que és especialment eficient en aquests casos.
 *
 * Es vol ordenar els productes de menor a major eficiència utilitzant
 * l'algoritme d'inserció.
 *
 * VARIABLES D'ENTRADA:
 * - eficiències[] (double[]): key ratio = unitats / consum diari
 *
 * TAULA DE PRODUCTES:
 *
 * | Nº | Producte         | Eficiència (key ratio) |
 * |----|------------------|------------------------|
 * | 1  | Arròs            | 12.0                   |
 * | 2  | Llenties         | 10.0                   |
 * | 3  | Farina           | 4.0                    |
 * | 4  | Sucre            | 5.0                    |
 * | 5  | Sal              | 4.0                    |
 * | 6  | Pasta            | 9.0                    |
 * | 7  | Galetes          | 10.0                   |
 * | 8  | Llet en pols     | 6.0                    |
 * | 9  | Cafè             | 9.0                    |
 * | 10 | Te               | 10.0                   |
 *
 * EXEMPLE DE SORTIDA:
 * [4.0, 4.0, 5.0, 6.0, 9.0, 9.0, 10.0, 10.0, 10.0, 12.0]
 */
 
public class ProductEfficiencySorter {

    // This function receives a list of efficiency values (as doubles)
    // and returns the list sorted in ascending order using insertion sort.
    public static double[] sortByEfficiency(double[] efficiencies) {
        for(int i = 1; i < efficiencies.length; i++) {
            double key = efficiencies[i];
            int j = i - 1;

            while(j >= 0 && efficiencies[j] > key) {
                efficiencies[j + 1] = efficiencies[j];
                j--;
            }

            efficiencies[j + 1] = key;
        }

        return efficiencies;
    }
	
	// -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        double[] efficiencies = {12.0, 10.0, 4.0, 5.0, 4.0, 9.0, 10.0, 6.0, 9.0, 10.0};
        double[] sorted = sortByEfficiency(efficiencies);

        System.out.print("Sorted efficiencies: [");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if (i < sorted.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
