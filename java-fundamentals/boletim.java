import javax.swing.JOptionPane;

public class boletim {
    public static void main(String[] args) {
        double nota1, nota2, media;
        String aluno;

        aluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));

        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        media =  (nota1 + nota2)/2;

        if(media>=7) {
            JOptionPane.showMessageDialog(null, "Aluno: " + aluno + "\nMédia: " + media + "\nSituação: Aprovado !");
        } else if (media>=5){
            JOptionPane.showMessageDialog(null, "Aluno: " + aluno + "\nMédia: " + media + "\nSituação: Recuperação !");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno: "+ aluno + "\nMédia: " + media + "\nSituação: Reprovado !");
        }
    }
}