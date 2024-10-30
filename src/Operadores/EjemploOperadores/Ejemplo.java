package Operadores.EjemploOperadores;


import java.util.Scanner;

// HACER UN PROGRAMA QUE CALCULE E IMPRIMA LA SUMA DE TRES CALIFICACIONES
public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, promedio;

        System.out.print("Digite la primera nota: ");
        nota1 = scanner.nextFloat();
        System.out.print("Digite la segunda nota: ");
        nota2 = scanner.nextFloat();
        System.out.print("Digite la tercer nota: ");
        nota3 = scanner.nextFloat();

        promedio = nota1 + nota2 + nota3;
        // promedio = Math.round(nota1 + nota2 + nota3);
        System.out.println("Su promedio es: " + promedio);


        scanner.close();

    }
}
