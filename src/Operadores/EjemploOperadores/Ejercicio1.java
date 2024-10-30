package Operadores.EjemploOperadores;

import java.util.Scanner;

// HACER UN PROGRAMA QUE CALCULE E IMPRIMA EL SALARIO MENSUAL
// DE UN EMPLEADO A PARTIR  DE SUS HORAS SEMANALES TRABAJADAS Y DE SU  SALARIO POR HORA
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char divisa = '$';
        int salarioSemanal, horasTrabajadas, salarioPorHora, salarioMensual;

        // pedimos datos
        System.out.print("Ingrese su salario semanal: ");
        salarioSemanal = scanner.nextInt();
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        horasTrabajadas = scanner.nextInt();

        salarioPorHora = salarioSemanal  / horasTrabajadas;
        salarioMensual = salarioPorHora * horasTrabajadas * 4;
        System.out.println("Su salario mensual es de: " + divisa + salarioMensual);
        scanner.close();

    }
}
