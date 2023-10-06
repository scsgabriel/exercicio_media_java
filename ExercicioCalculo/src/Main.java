
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Media mediaAluno = new Media();

        System.out.println("Vamos calcular a média das notas!");
        System.out.print("Qual é a primeira nota? ");
        mediaAluno.nota1 = sc.nextFloat();

        System.out.print("Qual é a segunda nota? ");
        mediaAluno.nota2 = sc.nextFloat();

        System.out.print("Qual é a terceira nota? ");
        mediaAluno.nota3 = sc.nextFloat();

        System.out.print("Qual é a quarta nota? ");
        mediaAluno.nota4 = sc.nextFloat();
        System.out.println();

        System.out.printf("O resultado a divisão das 4 notas é: %.2f", mediaAluno.divisorSoma());





    }
}