import java.util.Scanner;

public class CalculoSueldo {
    // Definimos la constante para el incremento del sueldo
    private static final double INCREMENTO_SUELDO = 0.30;

    public static void main(String[] args) {
        // Método 1: Utilizando Scanner para obtener los datos de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo base del empleado: ");
        double sueldoBase = scanner.nextDouble();

        // Método 2: Solicitando datos de entrada como argumentos de línea de comandos
        /* 
        double sueldoBase = Double.parseDouble(args[0]);
        */

        // Método 3: Utilizando JOptionPane para obtener los datos de entrada
        /* 
        String input = JOptionPane.showInputDialog("Ingrese el sueldo base del empleado:");
        double sueldoBase = Double.parseDouble(input);
        */

        // Calcular el sueldo final con el incremento del 30%
        double sueldoFinal = sueldoBase * (1 + INCREMENTO_SUELDO);

        // Imprimir el resultado
        System.out.println("El sueldo final del empleado es: " + sueldoFinal);

        // Cerrar el Scanner
        scanner.close();
    }
}
