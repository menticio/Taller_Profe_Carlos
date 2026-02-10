// Área y perímetro de un rectángulo
// El programa recibe la base y la altura y muestra su área y perímetro

import java.util.Scanner;

public class two {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la base del rectángulo:");
        double base = sc.nextDouble();

        System.out.println("Por favor ingrese la altura del rectángulo:");
        double altura = sc.nextDouble();

        // Cálculo del área
        double area = base * altura;

        // Cálculo del perímetro
        double perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }
}
