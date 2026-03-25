import javax.swing.JOptionPane;

//Use um laço for para imprimir uma pirâmide de asteriscos com 5 linhas.
public class lacoImprimirAsteristicos {
    public static void main (String[] args){
        
        String resultado = "";

        for (int i = 1; i <= 5; i++) {

            // Espaços
            for (int j = 1; j <= 5 - i; j++) {
                resultado += " ";
            }

            // Asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                resultado += "*";
            }

            resultado += "\n"; // quebra de linha
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
