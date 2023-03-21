import java.util.Scanner;

public class ManipulacaoDeString {
    public static void main(String[] args) {
        String nome = "Carlos";

        System.out.println("Primeiro nome: " + nome);

        String nomeCompleto = "";
        String sobrenome = "Alexandre";

        System.out.println("Nome Completo: " + (nome + " " + sobrenome));

        nomeCompleto = nome + sobrenome;

        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Tamanho do Nome Completo: " + nomeCompleto.length());

        String PrimeiroNome = nomeCompleto.substring(0,nome.length());
        System.out.println("Primeiro nome: " + PrimeiroNome);

        Scanner scn = new Scanner(System.in);

        System.out.println("Insira o Nome Completo");
        System.out.println("nome:\n");
        String nome1 = scn.nextLine();

        System.out.println("Sobrenome:\n");
        String sobrenome1 = scn.nextLine();

        String nomeCompleto1 = nome1 + sobrenome1;

        System.out.println("Tamanho: " + nomeCompleto.length());
        System.out.println("1a letra do nome: " + nomeCompleto.charAt(0));
        System.out.println("Sobrenome: " + nomeCompleto.substring((nome1.length()),(nomeCompleto1.length())));
        System.out.println("Nome completo em caixa alta: " + nomeCompleto.toUpperCase());
        System.out.println("Nome completo em caixa baixa: " + nomeCompleto.toLowerCase());







    }
}
