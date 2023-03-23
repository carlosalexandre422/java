import java.util.Scanner;

public class eleicaoSindical {
    public static void main(String[] args) {
        int a, b, c, nulos, brancos, total=0, validos=0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantidade de votos do candidato A: ");
        a = scn.nextInt();
        validos+=a;
        total+=a;

        System.out.println("Quantidade de votos do candidato B: ");
        b = scn.nextInt();
        total+=b;
        validos+=a;

        System.out.println("Quantidade de votos do candidato C: ");
        c = scn.nextInt();
        total+=c;
        validos+=a;

        System.out.println("Quantidade de votos nulos: ");
        nulos = scn.nextInt();
        total+=nulos;

        System.out.println("Quantidade de votos brancos: ");
        brancos = scn.nextInt();
        total+=brancos;

        System.out.println("Percentual de A em relação ao total de eleitores: " + ((float)a/total*100) + "%");
        System.out.println("Percentual de B em relação ao total de eleitores: " + ((float)b/total*100) + "%");
        System.out.println("Percentual de C em relação ao total de eleitores: " + ((float)c/total*100) + "%");
        System.out.println("Percentual de nulos em relação ao total de eleitores: " + ((float)nulos/total*100) + "%");
        System.out.println("Percentual de brancos em relação ao total de eleitores: " + ((float)brancos/total*100) + "%");

    }
}
