import javax.swing.JOptionPane;

public class numeroAte {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um numero: ");
        double numero1 = Double.parseDouble(numero);

        if (numero1 > 20) {
            JOptionPane.showMessageDialog(null,"O numero e: " + numero1);
        } else {
            JOptionPane.showMessageDialog(null,"O numero digitado nao foi maior que 20, tente novamente !");
        }
    }
}