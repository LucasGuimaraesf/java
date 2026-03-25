import javax.swing.JOptionPane;

public class areaCirculo {
    public static void main(String[] args) {

        String raio = JOptionPane.showInputDialog("Digite o raio do circulo:");
        double raio1 = Double.parseDouble(raio);
        
        double area = Math.PI * raio1 * raio1;

        JOptionPane.showMessageDialog(null, 
            String.format("A area do circulo e: %.2f", area));
    }
}