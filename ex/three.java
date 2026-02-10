//Conversión de monedas
//Crear un algoritmo que reciba una cantidad de dinero en dólares y la convierta a euros, sabiendo que 1 dólar equivale a 0.92 euros.

import java.util.*;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su cantidad de dinero en dollar");
        double dollar = sc.nextDouble();

        double euro = 0.92;

        double Conversion = dollar * euro;
        
        System.out.println("su cantidad de dinero de " + dollar + " a euro es : " + Conversion);

    }

}
