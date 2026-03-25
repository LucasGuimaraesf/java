import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double distanciaPercorrida = 0;
        double combustivelUtilizado = 0;
        double mediaConsumo = 0;
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Digite a distancia total percorrida em KM: ");
        distanciaPercorrida = obj.nextDouble();
        System.out.println("Digite a quantidade utilizada de combustivel em litros: ");
        combustivelUtilizado = obj.nextDouble();
        
        if(combustivelUtilizado != 0) {
            mediaConsumo = distanciaPercorrida / combustivelUtilizado;
            System.out.printf("O consumo medio do seu veiculo foi de %.2f km/l", mediaConsumo);
        } else {
            System.out.println("Nao e possivel calcular com a quantidade de combustivel igual a zero.");
        }
        obj.close();
        
    }
}