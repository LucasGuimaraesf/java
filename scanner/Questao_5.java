import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String nome;
        double nota1, nota2, nota3;
        double media;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();
        
        System.out.println("\nDigite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.println("\nDigite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.println("\nDigite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3.0;
        
        System.out.printf("\nA media aritmetica das notas do aluno %s foi %.2f.", nome, media);
        
        scanner.close();
    }
}