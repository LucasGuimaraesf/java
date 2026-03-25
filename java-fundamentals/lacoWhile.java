import javax.swing.JOptionPane;

//Use um laço while para encontrar o primeiro número divisível por 5 e 7 entre 1 e 100.

public class lacoWhile {
    public static void main(String[] args) {

        int numero = 1;
        
        while (numero <= 100) {

            if (numero % 5 == 0 && numero % 7 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + numero + " foi o primeiro encontrado !");
                break; //Vai parar no número encontrado
            }
            numero++;
        }
    }
}