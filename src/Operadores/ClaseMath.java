package Operadores;

public class ClaseMath {
    public static void main(String[] args) {
        // Sacar raiz cuadrada de un numero //
        double raiz = Math.sqrt(9);
        System.out.println(raiz);
        //------------------------------------
        int raizDos = (int)Math.sqrt(9);
        System.out.println(raizDos);

        // Elevar un numero a x potencia //
        double base = 5, exponente = 2;
        double potencia = Math.pow(base, exponente);
        System.out.println(potencia);

        // Redondear un numero //
        double numero = 4.675;
        long r = Math.round(numero);
        System.out.println(r);

        float numero2 = 5.67f;
        int r2 = Math.round(numero2);
        System.out.println(r2);

        // Obtener un numero aleatorio //
        int number = (int)(Math.random() * 100);
        System.out.println(number);
        // Prueba

    }
}
