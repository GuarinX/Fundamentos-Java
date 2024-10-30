package TiposDeDatos.EjempoTipoDatos;

public class CostoArticulos {
    public static void main(String[] args) {
        // Creacion de datos
        int cantidad = 50;
        float costoPorProducto = 3.99f;
        float total = cantidad * costoPorProducto;
        char divisa = '$';

        // Imprimos
        System.out.println("Numero de productos: " + cantidad);
        System.out.println("Costo por prodcuto: " +  costoPorProducto);
        System.out.println("Total: " + divisa + total);


    }
}
