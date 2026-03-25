import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        numero = scanner.nextInt();

        if (numero > 20) {
            System.out.println("O numero e: " + numero);
        } else {
            System.out.println("O numero digitado nao foi maior que 20, tente novamente !");
        }
    }
}