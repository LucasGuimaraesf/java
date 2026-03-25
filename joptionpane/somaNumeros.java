import javax.swing.JOptionPane;

public class somaNumeros {
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        double resultado = numero1 + numero2;
        
        JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " e " + numero2 + " é " + resultado);
    }
}