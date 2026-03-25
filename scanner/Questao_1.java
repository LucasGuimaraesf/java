import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = obj.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = obj.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("Resultado: " + resultado);
    }
}