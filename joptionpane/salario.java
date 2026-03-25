import javax.swing.JOptionPane;

public class salario {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do vendedor: ");
        
        String salario = JOptionPane.showInputDialog("Digite o salario do vendedor: ");
        double salarioF = Double.parseDouble(salario);
        
        String totalvendas = JOptionPane.showInputDialog(null, 
            String.format("\nDigite o valor total de vendas realizadas por %s: ", nome));
        double totalvendasF = Double.parseDouble(totalvendas);
        
        double comissao = totalvendasF * 0.15;
        
        double salariofinal = salarioF + comissao;
        
        JOptionPane.showMessageDialog(null, 
            String.format("O funcionario %s possui o salario fixo de %.2f. A comissao relacionada ao mes atual foi de %.2f. Logo, o valor a receber e de %.2f", nome, salarioF, comissao, salariofinal));        
    }
}