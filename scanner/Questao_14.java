import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("O menor numero e: " + num1);
        } else {
            System.out.println("O menor numero e: " + num2);
        }
    }
}