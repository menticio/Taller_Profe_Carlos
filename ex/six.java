/* Aprobado o reprobado
Un estudiante aprueba si su nota es mayor o igual a 60.
El programa debe mostrar si el estudiante aprueba o reprueba según su calificación.*/

import java.util.*;
import java.util.Scanner;

public class six {
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su primera  calificacion");
        double notaUno = sc.nextInt();

        System.out.println("ingrese su segunda  calificacion");
        double notaDos = sc.nextInt();

        System.out.println("ingrese su tercera  calificacion");
        double notaTres = sc.nextInt();

        double calculo = (notaUno + notaDos + notaTres)/3;

        System.out.println("Su promedio de las notas  :" + notaUno + "  "+ notaDos + "  "  + notaTres + " su promedio es : "+ calculo);

        if (calculo >= 60 ) {
            
            System.out.println("usted ha aprobado ");
        }else {

            System.out.println("USTED NO HA APROBADO");
        }

        }
}
