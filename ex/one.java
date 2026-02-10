import java.util.*;
import java.util.Scanner;

// Cálculo de salario semanal
//Un trabajador recibe un pago fijo por hora.
// El programa debe solicitar la cantidad de horas trabajadas en la semana y el pago por hora, y calcular el salario semanal total. 

    
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hola trabajador, ingrese el total de horas trabajadas:");
        int horaT = sc.nextInt();

        System.out.println("Ingrese el pago por hora:");
        int pagaHora = sc.nextInt();

        int salario = horaT * pagaHora;

        System.out.println("Su salario semanal total es: " + salario);
    }
}