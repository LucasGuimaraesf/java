import javax.swing.JOptionPane;

//Verifique se um número é positivo, negativo ou zero.
public class tipodenumero {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número:"));

    if(numero < 0){
            JOptionPane.showMessageDialog(null, "O número é negativo !");
        } else {
            JOptionPane.showMessageDialog(null, "O número é positivo !");
        }
    }
}
