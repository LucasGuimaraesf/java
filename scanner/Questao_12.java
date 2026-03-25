import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double raio;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");
        raio = scanner.nextDouble();

        area = Math.PI * raio * raio;

        System.out.println("A area do circulo e: " + area);
    }
}