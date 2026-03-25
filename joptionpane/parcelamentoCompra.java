import javax.swing.JOptionPane;

public class parcelamentoCompra {
    public static void main(String[] args) {

        String valorCompra = JOptionPane.showInputDialog("Digite o valor total da compra: ");
        double valorCompra1 = Double.parseDouble(valorCompra);

        String parcela = JOptionPane.showInputDialog("Deseja parcelar em quantas vezes ?");
        int parcela1 = Integer.parseInt(parcela);

        double valorParcelado = valorCompra1 / parcela1;

        JOptionPane.showMessageDialog(null,
            String.format("Valor de cada prestação será: R$ %.2f", valorParcelado));
    }
}