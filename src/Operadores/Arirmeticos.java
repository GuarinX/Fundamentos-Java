package Operadores;

import java.util.Scanner;

public class Arirmeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero1, numero2,suma,resta,mult,div,resto;
        System.out.print("Ingrese 2 numeros: ");
        numero1 = scanner.nextFloat();
        numero2 = scanner.nextFloat();
        //SUMA------------------------------
        suma = numero1 + numero2;
        System.out.println(suma);
        //RESTA-----------------------------
        resta = numero1 - numero2;
        System.out.println(resta);
        //MUTIPLICACION---------------------
        mult = numero1 * numero2;
        System.out.println(mult);
        //DIVISION--------------------------
        div = numero1 / numero2;
        System.out.println(div);
        //MODULUS---------------------------
        resto = numero1 % numero2;
        System.out.println(resto);
        scanner.close();

        //----------------------------------
        int x = 5, y;
        y = --x; // prefijo --x y sufijo x--
        System.out.println(y);
        System.out.println(x);
    }
}
