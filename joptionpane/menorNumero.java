import javax.swing.JOptionPane;

public class menorNumero {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        double numero1 = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        double numero2 = Double.parseDouble(num2);

        if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, "O menor numero e: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null,"O menor numero e: " + numero2);
        }
    }
}