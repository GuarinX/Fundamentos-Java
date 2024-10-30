package Operadores.EjemploOperadores;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char divisa = '$';
        int precioPorAuto, numeroDeAutos;
        float salarioMensual;
        final int pagoMensual = 1000;
        final int comision = 150;

        //pedimos los datos
        System.out.printf("Digite el numero de autos vendidos: ");
        numeroDeAutos = scanner.nextInt();
        System.out.printf("Digite el valor del auto vendido: ");
        precioPorAuto = scanner.nextInt();

        //operacion
        salarioMensual = pagoMensual +(comision * numeroDeAutos) + (0.05f * precioPorAuto * numeroDeAutos);
        System.out.println("Su salario mensual es de: " + divisa + salarioMensual);

        scanner.close();
    }
}
