package Operadores.EjemploOperadores;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float participacion, primerExamen, segundoExamen, examenFinal;
        System.out.printf("Ingrese la calificacion por participacion: ");
        participacion = scanner.nextFloat();
        System.out.printf("Ingrese la nota del primer examen: ");
        primerExamen = scanner.nextFloat();
        System.out.printf("Ingrese la nota del segundo examen: ");
        segundoExamen = scanner.nextFloat();
        System.out.printf("Ingrese la nota del examen final: ");
        examenFinal = scanner.nextFloat();

        float calificacionFinal = (participacion * 0.1f) + (primerExamen * 0.25f) + (segundoExamen * 0.25f) + (examenFinal * 0.4f);
        System.out.println("Su calificacion final es de: " + calificacionFinal);

        scanner.close();
    }
}
