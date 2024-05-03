public class CalculoSueldo {
    // Definimos la constante para el incremento del sueldo
    private static final double INCREMENTO_SUELDO = 0.30;

    public static void main(String[] args) {
        // Definimos el sueldo base del empleado
        double sueldoBase = 1000.0; // Por ejemplo, un sueldo base de $1000

        // Calculamos el sueldo final
        double sueldoFinal = calcularSueldoFinal(sueldoBase);

        // Imprimimos el resultado
        System.out.println("El sueldo final del empleado es: " + sueldoFinal);
    }

    // Método para calcular el sueldo final
    public static double calcularSueldoFinal(double sueldoBase) {
        // Aplicamos el incremento al sueldo base
        double sueldoIncrementado = sueldoBase * (1 + INCREMENTO_SUELDO);
        return sueldoIncrementado;
    }
}
