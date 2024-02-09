// DeathbatO

public class ParandoTiempo{

    public static void main(String[] args) {
        // Ejemplo de uso
        // Suma 5 + 7 y retorna el resultado después de 3 segundos
        sumAsync(5, 7, 3); 
    }

    public static void sumAsync(int a, int b, int seconds) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(seconds * 1000); // Convertir segundos a milisegundos
                int result = a + b;
                System.out.println("La suma es: " + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }
}