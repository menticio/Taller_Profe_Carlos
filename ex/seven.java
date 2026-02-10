/* Mayor de tres números
Diseñar un algoritmo que lea tres números distintos y muestre cuál es el mayor. */


import java.util.*;
import java.util.Scanner;

public class seven {
    
     public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su primer numero ");
        double Uno = sc.nextInt();

        System.out.println("ingrese su segundo numero ");
        double Dos = sc.nextInt();

        System.out.println("ingrese su tercer numero ");
        double Tres = sc.nextInt();

        if (Uno > Dos && Uno > Tres) {
            System.out.println("el numero mayor es : "+ Uno);
        }else if (Dos > Uno && Dos > Tres) {
            System.out.println("el numero mayor es : "+ Dos);
        }else if(Tres > Uno && Tres > Dos){
            System.out.println("el numero mayor es " + Tres);
        }

        
    }
}
