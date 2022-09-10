package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
            System.out.println("O menor número é: " + n2);
        } else if (n2 > n1) {
            System.out.println("O maior número é: " + n2);
            System.out.println("O menor número é: " + n1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
