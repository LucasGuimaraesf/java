import javax.swing.JOptionPane;

public class celsiusToF {
    public static void main(String[] args) {

        String C = JOptionPane.showInputDialog("Digite a temperatura em Celsius: ");
        double C1 = Double.parseDouble(C);
        
        double F = (9*C1+160)/5;
        
        JOptionPane.showMessageDialog(null,
            String.format("A temperatura de %.2f ºC em Fahrenheit e %.2f ºF.", C1, F));
    }
}