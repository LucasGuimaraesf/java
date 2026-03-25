import javax.swing.JOptionPane;

//Calcule a soma dos primeiros 10 números naturais usando um laço for.
public class somaDosNumerosNaturais {
    public static void main(String[] args) {
        int soma = 0;

        for (int numero = 0; numero <= 10; numero++) {
            soma += numero;
        }
        JOptionPane.showMessageDialog(null, "A soma dos 10 números naturais é " + soma);
        
    }
}
