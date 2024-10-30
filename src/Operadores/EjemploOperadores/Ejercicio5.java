package Operadores.EjemploOperadores;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x;
        System.out.printf("Ingrese el valor de a: ");
        a = scanner.nextInt();
        System.out.printf("Ingrese el valor de b: ");
        b = scanner.nextInt();
        System.out.printf("Ingrese el valor de c: ");
        c = scanner.nextInt();

        // calculamos b ala 2 - 4ac //
        double discriminante = Math.pow(b, 2) - 4*a*c;
        // guardamos el resultado de la raiz //
        double raizDiscriminante = Math.sqrt(Math.abs(discriminante));
        // calculamos //
        double raiz1 = (-b + raizDiscriminante) / (2*a);
        double raiz2 = (-b - raizDiscriminante) / (2*a);

        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);

        scanner.close();
    }
}
