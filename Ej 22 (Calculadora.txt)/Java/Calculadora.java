import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora{

    public static double calcularResultado(String expresion) {
        try {
            Expression e = new ExpressionBuilder(expresion).build();
            return e.evaluate();
        } catch (Exception ex) {
            // Manejar errores de evaluación de expresión
            ex.printStackTrace();
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        String fileName = "datos.txt";
        StringBuilder operations = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    operations.append(line).append(" ");
                }
            }
            double resultado = calcularResultado(operations.toString().trim());
            System.out.println(resultado);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo " + fileName);
        }
    }
}