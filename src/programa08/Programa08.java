package programa08;

import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        String nomeCapitalizado = uppercaseFirstLetter(nome);

        System.out.println("Olá " + nomeCapitalizado + "!");
        System.out.println("Seja bem vindo!");
    }

    public static String uppercaseFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
