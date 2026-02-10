/* Descuento en una compra
Si el monto de una compra es mayor a 100, se aplica un 10% de descuento.
El algoritmo debe mostrar el total a pagar. */

import java.util.Scanner;

public class eigth {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de su compra ");
        double valor = sc.nextDouble(); 

        double calculo = 0;

        if (valor > 100) {
            
            calculo = valor - (valor * 0.10);
            System.out.println("el total de su compra es : "+ ((int)calculo));

        }else{
            System.out.println(" valor insuficiente para aplicar u8n 10% de descuento : " +  valor); 

        }

    }


}
