import javax.swing.JOptionPane;

public class calculosMultiplos {
    public static void main(String[] args) {
        double soma, subtracao, multiplicacao, divisao = 0;
        
        String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        JOptionPane.showMessageDialog(null, "O resultado da soma e " + soma);
        JOptionPane.showMessageDialog(null, "O resultado da multiplicacao e " + multiplicacao);
        JOptionPane.showMessageDialog(null, "O resultado da subtracao e " + subtracao);
        JOptionPane.showMessageDialog(null,
            String.format("O resultado da divisao e %.2f", divisao));
    }
}