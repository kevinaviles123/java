import javax.swing.JOptionPane;

public class PrecedenciaOperadoresJOptionPane {

    public static void main(String[] args) {
        // Solicitar valor de a
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a:"));

        // Solicitar valor de b
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b:"));

        // Solicitar valor de c
        int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c:"));

        // Solicitar valor de d
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de d:"));

        // Cálculo de la expresión
        int resultado = a * b / (c - d) % (a - b);

        // Mostrar resultado
        JOptionPane.showMessageDialog(null, "Resultado de la expresión: " + resultado);
    }
}
