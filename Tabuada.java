import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(" 1. Some\n 2. Subtraçao\n 3. Multiplicação\n 4. Divisão\n");
        int i = scn.nextInt();

        do {
            System.out.println("Só essas 4 opções!!!\n 1. Soma\n 2. Subtraçao\n 3. Multiplicação\n 4. Divisão\n");
            i = scn.nextInt();
            switch(i){
                case 1:
                    System.out.println("Insira o primeiro valor: ");
                    int a = scn.nextInt();

                    System.out.println("Insira o segundo valor: ");
                    int b = scn.nextInt();

                    Soma(a,b);
                    break;
                case 2:
                    System.out.println("Insira o primeiro valor: ");
                    int c = scn.nextInt();

                    System.out.println("Insira o segundo valor: ");
                    int d = scn.nextInt();

                    Subtracao(c,d);
                    break;
                case 3:
                    System.out.println("Qual a tabuada? ");
                    int e = scn.nextInt();

                    Multiplicacao(e);
                    break;
                case 4:
                    System.out.println("Insira o primeiro valor: ");
                    int f = scn.nextInt();

                    System.out.println("Insira o segundo valor: ");
                    int g = scn.nextInt();

                    Divisao(f,g);
                    break;
            }
            System.out.println("Deseja começar denovo? ");
            i = scn.nextInt();
        } while(((i<1)||(i>1)));

    }
    public static void Multiplicacao(int num){
    for(int i = num; i<=num;i++){
        for(int f = 0; f<=10; f++){
            System.out.println(i + " * " + f + " = " + (i*f));
        }
    }

    }
    public static void Soma(int a, int b){

        System.out.println(a + "+" + b + "=" + (a+b));


    }
    public static void Subtracao(int a, int b){

        System.out.println(a + "-" + b + "=" + (a-b));


    }
    public static void Divisao(float a, float b){

        System.out.println(a + " / " + b + " = " + (a/b));


    }
}
