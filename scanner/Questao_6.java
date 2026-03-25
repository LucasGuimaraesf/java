import java.util.Scanner;
// Escrever uma programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.

class Main {
    public static void main(String[] args) {
        Double A, B, temporaria;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        A = scanner.nextDouble();
        
        System.out.println("\nDigite o segundo valor: ");
        B = scanner.nextDouble();
        
        temporaria = A;
        A = B;
        B = temporaria;
        
        System.out.printf("\nValores trocados: ");
        System.out.printf("\nA = %.2f", A);
        System.out.printf("\nB = %.2f", B);
        
        scanner.close();
    }
}