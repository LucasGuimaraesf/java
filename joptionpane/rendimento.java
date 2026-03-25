import javax.swing.JOptionPane;

public class rendimento {
    public static void main(String[] args) {

        String deposito = JOptionPane.showInputDialog("Digite o valor depositado: ");
        double deposito1 = Double.parseDouble(deposito);

        double rendimento = deposito1 * 0.007;
        double valorFinal = deposito1 + rendimento;

        JOptionPane.showMessageDialog(null,
            String.format("Valor apos 1 mes de rendimento: R$ %.2f", valorFinal));
    }
}