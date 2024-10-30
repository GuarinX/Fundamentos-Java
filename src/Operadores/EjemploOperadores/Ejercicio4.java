package Operadores.EjemploOperadores;

import java.util.Scanner;
//CALCULAR EL CUADRADO DE UNA SUMA
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variables declaradas
        int primerNumero, segundoNumero, cuadradoSuma;

        // pedimos datos
        System.out.printf("Ingresde el valor del primer numero: ");
        primerNumero = scanner.nextInt();
        System.out.printf("Ingrese el valor del segundo numero: ");
        segundoNumero = scanner.nextInt();

        // calculamos el cuadrado
        cuadradoSuma = (int) ((Math.pow(primerNumero, 2) + Math.pow(segundoNumero, 2)) + (2 * primerNumero * segundoNumero));
        System.out.println(cuadradoSuma);
        scanner.close();
    }
}
