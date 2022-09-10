package programa04;

import java.util.Scanner;

public class Programa04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n1, n2, soma, subtracao, multiplicacao, divisao;

            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = sc.nextInt();

            soma = n1 + n2;
            subtracao = n1 - n2;
            multiplicacao = n1 * n2;
            divisao = n1 / n2;

            System.out.println("Soma = " + soma);
            System.out.println("Subtração = " + subtracao);
            System.out.println("Multiplicação = " + multiplicacao);
            System.out.println("Divisão = " + divisao);
        }

}
