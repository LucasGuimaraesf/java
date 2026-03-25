import javax.swing.JOptionPane;

public class acrescimoValor {
    public static void main(String[] args) {

        String precoCusto = JOptionPane.showInputDialog("Digite o preço de custo do produto: ");
        double precoCusto1 = Double.parseDouble(precoCusto);

        String percentual = JOptionPane.showInputDialog("Digite o percentual de acrescimo: ");
        double percentual1 = Double.parseDouble(percentual);

        double valorVenda = precoCusto1 + (precoCusto1 * percentual1 / 100);

        JOptionPane.showMessageDialog(null,"Valor de venda do produto: R$ " + valorVenda);
    }
}