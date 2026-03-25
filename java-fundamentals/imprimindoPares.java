import javax.swing.JOptionPane;

//Imprima todos os números ímpares entre 1 e 50 usando um laço for.
public class imprimindoPares {
    public static void main (String[] args) {

        String resultado = "";

        for(int numero = 0; numero <= 50; numero++){
            if (numero % 2 != 0) {
                resultado += numero + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,"Seguem os número ímpares até 50: \n" + resultado);
    }
}
