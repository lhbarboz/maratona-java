package academy.exercises;

import java.util.Scanner;
//Dado um dia de semana, diga se ele é dia útil ou final de semana

public class Class05QualODiaDaSemana {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual seu dia escolhido? ");
        byte numDiaSemana = scanner.nextByte();

        switch (numDiaSemana) {
            case 1:
                System.out.println("Domingo. É final de semana, eba!!!");
                break;
            case 2:
                System.out.println("Segunda. É dia útil, vamos trabalhar!");
                break;
            case 3:
                System.out.println("Terça. É dia útil, vamos trabalhar!");
                break;
            case 4:
                System.out.println("Quarta. É dia útil, vamos trabalhar!");
                break;
            case 5:
                System.out.println("Quinta. É dia útil, vamos trabalhar!");
                break;
            case 6:
                System.out.println("Sexta. É dia útil, vamos trabalhar!");
                break;
            case 7:
                System.out.println("Sábado. É final de semana, eba!!!");
                break;
            default:
                System.out.println("Dia inválido!");
        }
        scanner.close();
    }
}