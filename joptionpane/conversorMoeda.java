import javax.swing.JOptionPane;

//Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

public class conversorMoeda {
    public static void main(String[] args) {
                
        String valorDolar = JOptionPane.showInputDialog("Digite a cotação do dolar atual: ");
        double valorDolar1 = Double.parseDouble(valorDolar);
        
        String quantidadeUS = JOptionPane.showInputDialog("Digite a quantidade em dolar(US) que deseja converter em real(RS):");
        double quantidadeUS1 = Double.parseDouble(quantidadeUS);
        
        
        //Convertendo dolar em real
        double quantidadeReal = quantidadeUS1 * valorDolar1;
        
        JOptionPane.showMessageDialog(null,
            String.format("O valor de %.2f dolares convertido em reais e aproximadamente %.2f.", quantidadeUS1, quantidadeReal));
    }
}