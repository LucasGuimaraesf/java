import javax.swing.JOptionPane;

public class menorParaMaior {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        double numero1 = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("Digite o segundo numero:");
        double numero2 = Double.parseDouble(num2);

        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null,"O menor valor é " + num1 + ", maior valor é " + num2);
        } else {
            JOptionPane.showMessageDialog(null,"O menor valor é "+ num2 + ", maior valor é " + num1);
        }
    }
}