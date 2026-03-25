import javax.swing.JOptionPane;
// Escrever uma programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

public class trocaValores {
    public static void main(String[] args) {

        String A = JOptionPane.showInputDialog("Digite o valor A: ");
        double A1 = Double.parseDouble(A);
        
        String B = JOptionPane.showInputDialog("Digite o valor B: ");
        double B1 = Double.parseDouble(B);
        
        double temporaria = A1;
        A1 = B1;
        B1 = temporaria;

        JOptionPane.showMessageDialog(null,
            String.format("Trocando Valores: A = %.2f", A1));
        JOptionPane.showMessageDialog(null,
            String.format("Trocando Valores: B = %.2f", B1));
    }
}