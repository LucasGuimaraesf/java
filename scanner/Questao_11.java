import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double precoCusto;
        double percentual;
        double valorVenda;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto: ");
        precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acrescimo: ");
        percentual = scanner.nextDouble();

        valorVenda = precoCusto + (precoCusto * percentual / 100);

        System.out.println("Valor de venda do produto: R$ " + valorVenda);
    }
}