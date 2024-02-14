//DeathbatO

public class MCDyMCM {

    public static int maximoComunDivisor(int a, int b) {
        /**
        * Calcula el máximo común divisor (MCD) de dos números enteros a y b.
        */
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int minimoComunMultiplo(int a, int b) {
        /**
        * Calcula el mínimo común múltiplo (mcm) de dos números enteros a y b.
        */
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / maximoComunDivisor(a, b);
    }
    
    public static void main(String[] args) {
        // Ejemplo de uso
        int num1 = 12;
        int num2 = 18;
        System.out.println("MCD de " + num1 + " y " + num2 + " es: " + maximoComunDivisor(num1, num2));
        System.out.println("MCM de " + num1 + " y " + num2 + " es: " + minimoComunMultiplo(num1, num2));
    }
}
