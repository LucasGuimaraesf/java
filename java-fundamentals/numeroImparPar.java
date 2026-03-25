import javax.swing.JOptionPane;

//Determine se um número é par ou ímpar.
public class numeroImparPar {
    public static void main (String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par !");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar !");
        }
    }
}