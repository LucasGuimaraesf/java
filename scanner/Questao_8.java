import java.util.Scanner;

//Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

class Main {
    public static void main(String[] args) {
        double quantidadeReal, valorDolar, quantidadeUS;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a cotação do dolar atual: ");
        valorDolar = scanner.nextDouble();
        
        System.out.println("Digite a quantidade em dolar(US) que deseja converter em real(RS):");
        quantidadeUS = scanner.nextDouble();
        
        //Convertendo dolar em real
        quantidadeReal = quantidadeUS * valorDolar;
        
        System.out.printf("\nO valor de %.2f dolares convertido em reais e aproximadamente %.2f.", quantidadeUS, quantidadeReal);
        
        scanner.close();
    }
}