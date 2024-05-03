import javax.swing.JOptionPane;

public class SueldoEmpleadoJOptionPane {

    public static void main(String[] args) {
        // Solicitar nombre del empleado
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        // Solicitar horas trabajadas
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));

        // Solicitar pago por hora
        double pagoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora:"));

        // Cálculo del sueldo bruto
        double sueldoBruto = horasTrabajadas * pagoPorHora;

        // Cálculo del incremento
        double incrementoSueldo = sueldoBruto * INCREMENTO;

        // Cálculo del sueldo final
        double sueldoFinal = sueldoBruto + incrementoSueldo;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Empleado: " + nombre + "\n" +
                "Horas trabajadas: " + horasTrabajadas + "\n" +
                "Pago por hora: " + pagoPorHora + "\n" +
                "Sueldo bruto: " + sueldoBruto + "\n" +
                "Incremento: " + incrementoSueldo + "\n" +
                "Sueldo final: " + sueldoFinal);
    }
}
