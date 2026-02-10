/* Contador de positivos y negativos
El programa pide números hasta que el usuario ingrese 0.
Al final muestra cuántos fueron positivos y cuántos negativos.
*/

import java.util.Scanner;

public class eleven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingrese un número (0 para terminar):");
        n = sc.nextInt();

        while (n != 0) {

            if (n > 0) {
                positivos++;
            } else {
                negativos++;
            }

            System.out.println("Ingrese un número (0 para terminar):");
            n = sc.nextInt();
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
    }
}
