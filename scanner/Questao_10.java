import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double valorCompra;
        double prestacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        prestacao = valorCompra / 5;

        System.out.println("Valor de cada prestacao: R$ " + prestacao);
    }
}