import javax.swing.JOptionPane;

public class consumoMedioCombustivel {
    public static void main(String[] args) {
        
        String distanciaPercorrida = JOptionPane.showInputDialog("Digite a distancia total percorrida em KM: ");
        String combustivelUtilizado = JOptionPane.showInputDialog("Digite a quantidade utilizada de combustivel em litros: ");

        //Convertendo para o formato de números
        double distanciaPercorridaF = Double.parseDouble(distanciaPercorrida);
        double combustivelUtilizadoF = Double.parseDouble(combustivelUtilizado);

        
        if(combustivelUtilizadoF != 0) {
            double mediaConsumo = distanciaPercorridaF / combustivelUtilizadoF;

            JOptionPane.showMessageDialog(null, 
                String.format("O consumo medio do seu veiculo foi de %.2f km/l", mediaConsumo));
        } else {
            JOptionPane.showMessageDialog(null, "Nao e possivel calcular com a quantidade de combustivel igual a zero.");
        }        
    }
}