package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
