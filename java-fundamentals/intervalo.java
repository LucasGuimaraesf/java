import javax.swing.JOptionPane;

//Verifique se um número está dentro de um intervalo (por exemplo, entre 10 e 100).
public class intervalo {
    public static void main(String[] args){
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if(valor >= 10 && valor <= 100){
            JOptionPane.showMessageDialog(null, "O valor " + valor + " está dentro do intervalo entre 10 e 100.");
        } else {
            JOptionPane.showMessageDialog(null, "O valor " + valor + " não está dentro do intervalo entre 10 e 100.");
        }
    }
}
