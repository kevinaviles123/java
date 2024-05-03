import java.util.Scanner;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Método 1: Utilizando Scanner para obtener los datos de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Método 2: Solicitando datos de entrada como argumentos de línea de comandos
        /*
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        */

        // Método 3: Utilizando JOptionPane para obtener los datos de entrada
        /*
        String inputA = JOptionPane.showInputDialog("Ingrese el valor de a:");
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog("Ingrese el valor de b:");
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog("Ingrese el valor de c:");
        double c = Double.parseDouble(inputC);
        */

        // Calcular el resultado de acuerdo a la precedencia de operadores
        double resultado = a * (b + c);

        // Imprimir el resultado
        System.out.println("El resultado de la expresión a * (b + c) es: " + resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}
