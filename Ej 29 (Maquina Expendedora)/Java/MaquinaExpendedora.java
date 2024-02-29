import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author DeathbatO
 */

public class MaquinaExpendedora {

    public static void main(String[] args) {
        int[] monedasRecibidas = {200, 100, 50, 10};
        int seleccionProducto = 1; // Elige el primer producto
        Resultado resultado = maquinaExpendedora(monedasRecibidas, seleccionProducto);
        System.out.println(resultado);
    }

    static class Resultado {
        String mensaje;
        String producto;
        List<Integer> monedas;

        public Resultado(String mensaje, String producto, List<Integer> monedas) {
            this.mensaje = mensaje;
            this.producto = producto;
            this.monedas = monedas;
        }

        @Override
        public String toString() {
            return "Resultado{" +
                    "mensaje='" + mensaje + '\'' +
                    ", producto='" + producto + '\'' +
                    ", monedas=" + monedas +
                    '}';
        }
    }

    public static Resultado maquinaExpendedora(int[] monedas, int seleccion) {
        List<Integer> monedasValidas = Arrays.asList(5, 10, 50, 100, 200);
        List<Integer> monedasVuelta = new ArrayList<>();
        int totalMonedas = 0;

        // Verificar si las monedas recibidas son válidas
        for (int moneda : monedas) {
            if (!monedasValidas.contains(moneda)) {
                return new Resultado("Moneda no válida", null, arrayToList(monedas));
            }
            totalMonedas += moneda;
        }

        // Definir los productos
        String[] productos = {"Refresco", "Chocolate", "Café"};

        // Verificar si el número de producto existe
        if (seleccion < 1 || seleccion > productos.length) {
            return new Resultado("Número de producto no válido", null, arrayToList(monedas));
        }

        // Obtener el producto seleccionado
        String productoSeleccionado = productos[seleccion - 1];

        // Definir precios de productos
        int[] precios = {150, 100, 120};
        int precioSeleccionado = precios[seleccion - 1];

        // Verificar si el dinero es suficiente para comprar el producto
        if (totalMonedas < precioSeleccionado) {
            return new Resultado("Dinero insuficiente", null, arrayToList(monedas));
        }

        // Calcular el cambio y devolverlo con el menor número de monedas posibles
        int cambio = totalMonedas - precioSeleccionado;
        for (int i = monedasValidas.size() - 1; i >= 0; i--) {
            int moneda = monedasValidas.get(i);
            while (cambio >= moneda) {
                monedasVuelta.add(moneda);
                cambio -= moneda;
            }
        }

        return new Resultado(null, productoSeleccionado, monedasVuelta);
    }

    private static List<Integer> arrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }
}
