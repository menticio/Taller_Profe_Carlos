/* Promedio de un arreglo
Diseñar un algoritmo que almacene 10 números en un arreglo
y calcule el promedio, el número mayor y el menor.
*/

public class therteen {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int suma = 0;
        int mayor = array[0];
        int menor = array[0];

        for (int i : array) {

            suma += i;

            if (i > mayor) {
                mayor = i;
            }

            if (i < menor) {
                menor = i;
            }
        }

        double promedio = (double) suma / array.length;

        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
