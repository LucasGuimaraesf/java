import javax.swing.JOptionPane;

//Imprima os números de 1 a 10 usando um laço for.
public class lacoFor {
    public static void main(String[] args) {

        String resultado = "";

        for (int numero = 0; numero <= 10; numero++) {
            resultado += numero + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}