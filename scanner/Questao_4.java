import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String nome;
        double salario = 0;
        double totalvendas = 0;
        double comissao = 0;
        double salariofinal = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor: ");
        nome = scanner.nextLine();
        
        System.out.println("\nDigite o salario do vendedor: ");
        salario = scanner.nextDouble();
        
        System.out.printf("\nDigite o valor total de vendas realizadas por %s: ", nome);
        totalvendas = scanner.nextDouble();
        
        comissao = totalvendas * 0.15;
        
        salariofinal = salario + comissao;
        
        System.out.printf("\nO funcionario %s possui o salario fixo de %.2f. A comissao relacionada ao mes atual foi de %.2f. Logo, o valor a receber e de %.2f", nome, salario, comissao, salariofinal);
        
        scanner.close();
        
    }
}