import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int C, F;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Celsius: ");
        C = scanner.nextInt();
        
        F = (9*C+160)/5;
        
        System.out.printf("\n A temperatura de %d ºC em Fahrenheit e %d ºF.", C, F);
        
        scanner.close();
    }
}