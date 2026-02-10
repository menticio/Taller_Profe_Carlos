package fiveteen;
/*Sistema de estudiantes (Programación Orientada a Objetos)
Diseñar una clase Estudiante que tenga como atributos: nombre, curso matriculado y tres calificaciones.
El programa debe permitir crear un estudiante, calcular su promedio y mostrar si aprueba o reprueba*/

import java.util.Scanner;
import java.util.*;

public class Estudiante {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Porfavor ingrese su nombre");
        String nombre = sc.nextLine() ;

        System.out.println("Porfavor ingrese el curso al que se matriculo");
        String cursoMatriculado = sc.nextLine();
        
        System.out.println("Porfavor ingrese su primer nota");
        Double NotaUno = sc.nextDouble();

        System.out.println("Porfavor ingrese su segunda nota");
        Double NotaDos = sc.nextDouble();

        System.out.println("Porfavor ingrese su tercer nota");
        Double  NotaTres = sc.nextDouble();

        calculos estudiante = new calculos( nombre , cursoMatriculado , NotaUno , NotaDos , NotaTres);
        
        double promedio = estudiante.calcular();

          if (estudiante.aprueba()) {
           
           System.out.println("el estudiante "+ nombre  +" el cual se ha matriculado al curso : "+ cursoMatriculado +  " la suma de sus notas ( La nota Uno " + NotaUno + "  la nota Dos " + NotaDos+ "  La nota tres " + NotaTres + " ) da como resultado :"+((int)promedio) + " lo que indica que  aprobo");
        } else {
            System.out.println("el estudiante "+ nombre  +" el cual se ha matriculado al cursoMatriculado : "+ cursoMatriculado +  " la suma de sus notas ( La nota Uno " + NotaUno + "  la nota Dos " + NotaDos+ "  La nota tres " + NotaTres + " ) da como resultado :"+((int)promedio) + " lo que indica que no aprobo");
        }
        

    }
}
