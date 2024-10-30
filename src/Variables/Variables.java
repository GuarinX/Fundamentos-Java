package Variables;

public class Variables {
    public static void main(String[] args) {
        // -----------------------------------
        String nombre = "Alejo ";
        String apellido = "Guarin";
        String nombreCompleto = nombre + apellido;
        System.out.println("Su nombre es: " + nombreCompleto);
        // -----------------------------------
        int edad = 21;
        System.out.println(edad);
        //------------------------------------
        int cedula;
        cedula = 1003625223;
        System.out.println(cedula);
        //------------------------------------
        double saldo = 23.000;
        saldo = 50.000;
        System.out.println(saldo);
        //------------------------------------
        final int myNum = 2;
        //myNum = 45; // no de puede sobrescribir el valor de una variable constante
        //------------------------------------
        int x = 5, y = 4, z = 8;
        System.out.println(x + y + z);
        //------------------------------------
        int a, b, c;
        a = b = c = 2;
        System.out.println(a + b + c);
    }
}
