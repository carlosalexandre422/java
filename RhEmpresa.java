import javax.swing.JOptionPane;
import java.util.ArrayList;

public class RhEmpresa {
    public static void main(String[] args) {
        float maior = 0, menor = 99999999, somaSalario = 0;
        int n;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de funcionários: "));
        } while(n<1||n>40);

        String[] nome = new String[n];
        float[] salario = new float[n];

        for(int i = 0; i<=n; i++){
            nome[i] = JOptionPane.showInputDialog("Insira o nome do " + (i+1) + "o funcionario: ");
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário do " + (i+1) + "o funcionario: "));
            somaSalario += salario[i];
        }

        ArrayList maiorSal = new ArrayList();

        for(int i = 0; i<=n; i++){
            if(maior<=salario[i]){
                maior = salario[i];
            }
            if(menor>=salario[i]){
                menor = salario[i];
            }
            if(maior == salario[i]){
                maiorSal.add(salario[i]);
            }
        }
        float mediaSalarial = somaSalario/n;

        JOptionPane.showMessageDialog(null, maiorSal);
    }
}
