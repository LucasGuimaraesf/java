import javax.swing.JOptionPane;

public class mediaAluno {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        
        String nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
        double nota1F = Double.parseDouble(nota1);
        
        
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
        double nota2F = Double.parseDouble(nota2);

              
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
        double nota3F = Double.parseDouble(nota3);
                
        double media = (nota1F + nota2F + nota3F) / 3.0;
        
        JOptionPane.showMessageDialog(null,
            String.format("A media aritmetica das notas do aluno %s foi %.2f.", nome, media));
    }
}