package programa09;

import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaSemana;

        System.out.print("Digite um número de 1 a 7: ");
        diaSemana = sc.nextInt();

//        switch (diaSemana) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda-feira");
//                break;
//            case 3:
//                System.out.println("Terça-feira");
//                break;
//            case 4:
//                System.out.println("Quarta-feira");
//                break;
//            case 5:
//                System.out.println("Quinta-feira");
//                break;
//            case 6:
//                System.out.println("Sexta-feira");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Número inválido");
//                break;
//        }

        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Número inválido");
        }
    }
}
