import javax.swing.JOptionPane;

//Encontre e imprima a soma de todos os números múltiplos de 3 entre 1 e 100 usando um laço while.
public class numerosMultiplos {

    public static void main(String[] args){

        int numero = 1;
        String resultado = "";
        int soma = 0;

        while (numero <= 100){
            if(numero % 3 == 0){
                resultado += numero + "\n";
                soma += numero;
            }
        numero++;
        }
        JOptionPane.showMessageDialog(null,"Números múltiplos por 3:\n" + resultado + "\nSoma: " + soma);
    }
}