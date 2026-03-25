import javax.swing.JOptionPane;

//Utilize um switch para imprimir os dias da semana baseados em um número (1 = Domingo, 2 = Segunda, etc.).
public class switchDias {
    public static void main(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o dia de hoje: \n Dia 1 - Domingo\n Dia 2 - Segunda-Feira\n Dia 3 - Terça-Feira\n Dia 4 - Quarta-Feira\n Dia 5 - Quinta-Feira\n Dia 6 - Sexta-Feira\n Dia 7 - Sábado"));

        switch(opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "Hoje é domingo !");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Hoje é segunda-feira !");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Hoje é terça-feira !");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Hoje é quarta-feira !");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Hoje é quinta-feira !");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Hoje é sexta-feira !");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Hoje é sábado !");
                break;
        }
    }
}