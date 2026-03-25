import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double deposito;
        double rendimento;
        double valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor depositado: ");
        deposito = scanner.nextDouble();

        rendimento = deposito * 0.007;
        valorFinal = deposito + rendimento;

        System.out.println("Valor apos 1 mes de rendimento: R$ " + valorFinal);
    }
}