import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double soma, subtracao, multiplicacao, divisao = 0;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = obj.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = obj.nextDouble();
        
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;
        
        System.out.println("O resultado da soma e " + soma);
        System.out.printf("O resultado da subtracao e %.2f", subtracao);
        System.out.printf("\nO resultado da multiplicacao e %.2f", multiplicacao);
        System.out.printf("\nO resultado da divisao e %.2f", divisao);

        obj.close();
        
    }
}